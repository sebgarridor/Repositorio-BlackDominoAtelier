package cl.blackdomino.web.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.blackdomino.payload.request.LoginRequest;
import cl.blackdomino.payload.request.SignupRequest;
import cl.blackdomino.payload.response.JwtResponse;
import cl.blackdomino.payload.response.MessageResponse;
import cl.blackdomino.web.models.ERole;
import cl.blackdomino.web.models.Rol;
import cl.blackdomino.web.models.Usuario;
import cl.blackdomino.web.repositories.RolRepository;
import cl.blackdomino.web.repositories.UsuarioRepository;
import cl.blackdomino.web.security.jwt.JwtUtils;
import cl.blackdomino.web.security.services.UserDetailsImpl;




@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  UsuarioRepository usuarioRepository;

  @Autowired
  RolRepository rolRepository;

  @Autowired
  PasswordEncoder encoder;

  @Autowired
  JwtUtils jwtUtils;

  @PostMapping("/signin")
  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

    Authentication authentication = authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(loginRequest.getCorreo(), loginRequest.getPassword()));

    SecurityContextHolder.getContext().setAuthentication(authentication);
    String jwt = jwtUtils.generateJwtToken(authentication);
    
    UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();    
    List<String> roles = userDetails.getAuthorities().stream()
        .map(item -> item.getAuthority())
        .collect(Collectors.toList());

    return ResponseEntity.ok(new JwtResponse(jwt, 
            userDetails.getId(), 
            userDetails.getNombre(), 
            userDetails.getApellidos(),
            userDetails.getUsername(), //se obtiene correo
            roles));
  }

  @PostMapping("/signup")
  public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
    if (usuarioRepository.existsByCorreo(signUpRequest.getCorreo())) {
      return ResponseEntity
          .badRequest()
          .body(new MessageResponse("Error: Email is already in use!"));
    }

    if (usuarioRepository.existsByRut(signUpRequest.getRut())) {
      return ResponseEntity
          .badRequest()
          .body(new MessageResponse("Error: Rut is already registered!"));
    }

    // Create new user's account
    //mismo orden que constructor en la clase usuario
    Usuario usuario = new Usuario( signUpRequest.getNombre(),
    		signUpRequest.getApellidos(),
    		 signUpRequest.getCorreo(),
               encoder.encode(signUpRequest.getPassword()),
               signUpRequest.getRut(),
               signUpRequest.getTelefono());
    Set<Rol> roles = new HashSet<>();


  
          Rol userRole = rolRepository.findByNombre(ERole.ROLE_USER)
              .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
          roles.add(userRole);

  
    

    usuario.setRoles(roles);
    usuarioRepository.save(usuario);

    return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
  }
}
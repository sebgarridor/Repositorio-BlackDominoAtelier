package cl.blackdomino.web.api;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.blackdomino.web.models.Usuario;
import cl.blackdomino.web.models.UsuarioDTO;
import cl.blackdomino.web.security.JwtUtil;
import cl.blackdomino.web.services.JwtUserDetailsService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("/auth")
public class JwtAuthenticationController {

	
    private final AuthenticationManager authenticationManager; //inyeccion de dependencias

    private final PasswordEncoder encoder;
    private final JwtUtil jwtUtil;

    private final JwtUserDetailsService jwtUserDetailsService;

    @PostMapping("/login")
    public ResponseEntity<?> createAuthenticationToken(@Valid @RequestBody UserAuthDTO userAuthDTO) throws Exception {

        Authentication authentication =
                new UsernamePasswordAuthenticationToken(userAuthDTO.correo, userAuthDTO.password);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        System.out.println(authentication.toString());

        UsuarioDTO user = toDTO(jwtUserDetailsService.findUserByUsername(userAuthDTO.getCorreo()));
        UserDetails userDetails = jwtUserDetailsService.loadUserByUsername(user.getCorreo());
        String jwtToken = jwtUtil.generateToken(userDetails);

        return new ResponseEntity<>(new AuthResponseDTO(jwtToken), HttpStatus.OK);
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<?> saveUser(@RequestBody UsuarioDTO user) throws Exception {
       String passwordEncriptada = encoder.encode(user.getPassword());
        user.setPassword(passwordEncriptada);
        jwtUserDetailsService.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    private UsuarioDTO toDTO(Usuario user) {
        return  UsuarioDTO.builder()
                .correo(user.getCorreo())
                .password(user.getPassword())
                .build();
    }

    @Getter
    @Setter
    @Builder
    public static class UserAuthDTO {
        @NotNull
        private String correo;
        @NotNull
        private String password;
    }

    @Getter
    @Setter
    @Builder
    public static class AuthResponseDTO {
        private String jwt;
    }
}

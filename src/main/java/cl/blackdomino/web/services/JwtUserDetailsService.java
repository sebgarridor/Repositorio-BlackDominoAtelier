package cl.blackdomino.web.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Usuario;
import cl.blackdomino.web.models.UsuarioDTO;
import cl.blackdomino.web.repositories.UsuarioRepository;



@Service
public class JwtUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository userRepository;
	
	 public Usuario findUserByUsername(String correo) {
	        return userRepository.findUserByCorreo(correo);
	    }

	    @Override
	    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException { //sobre escribiendo el método traido desde UserDetailsService
	        Usuario user = userRepository.findUserByCorreo(correo);
	        return new org.springframework.security.core.userdetails.User(user.getCorreo(), user.getPassword(), new ArrayList<>());
	    }

	    private Collection<? extends GrantedAuthority> getAuthorities(Usuario user) {
	        String role = user.getRoles().toString();
	        return List.of(new SimpleGrantedAuthority("Role_"+role));
	    }


	    public Usuario save(UsuarioDTO user) { //DTO = direct transfer object, sólo se utiliza para traspasar información.
	        Usuario newUser = new Usuario();
	        newUser.setCorreo(user.getCorreo());
	        newUser.setPassword(user.getPassword());
	        return userRepository.save(newUser);
	    }

}

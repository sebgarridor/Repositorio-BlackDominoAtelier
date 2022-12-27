package cl.blackdomino.web.security.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.blackdomino.web.models.Usuario;
import cl.blackdomino.web.repositories.UsuarioRepository;





@Service
public class UserDetailsServiceImpl implements UserDetailsService {
  @Autowired
  UsuarioRepository usuarioRepository;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
    Usuario usuario = usuarioRepository.findByCorreo(correo)
        .orElseThrow(() -> new UsernameNotFoundException("User Not Found with email: " + correo));

    return UserDetailsImpl.build(usuario);
  }

}
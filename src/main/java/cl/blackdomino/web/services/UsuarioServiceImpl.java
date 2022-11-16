package cl.blackdomino.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Usuario;
import cl.blackdomino.web.repositories.UsuarioRepository;


@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired // inyección
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(usuario);
	}

}

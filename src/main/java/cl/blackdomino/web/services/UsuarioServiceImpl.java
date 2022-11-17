package cl.blackdomino.web.services;

import java.util.List;

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

	@Override
	public String eliminarUsuario(Long id) {
		// TODO Auto-generated method stub
		Boolean existe  = usuarioRepository.existsById(id);
		
		if(existe) {
			usuarioRepository.deleteById(id);
		}else {
			return "Usuario no existe en la tabla";
		}
		existe = usuarioRepository.existsById(id);
		//Optional<Usuario> usuario = usuarioRepositry.findById(id);
		if(existe) {
			return "Usuario no eliminado";
		}
		return "El usuario fue eliminado";
		}

	@Override
	public String actualizarUsuario(Usuario usuario) {
		Boolean existe = usuarioRepository.existsById(usuario.getId());
		if(existe) {
			usuarioRepository.save(usuario);
			return "Usuario actualizado";
		}
		return "Usuario creado";
	}

	@Override
	public Usuario obtenerUsuario(Long id) {
		Usuario user = usuarioRepository.findById(id).get();
		return user;
	}

	@Override
	public List<Usuario> obtenerListaUsuarios() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}
}

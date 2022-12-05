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

//--------------------Guardar----------------------------------
	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
//--------------------Eliminar----------------------------------
	@Override
	public String eliminarUsuario(Long id) {
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
//--------------------Actualizar----------------------------------
	@Override
	public String actualizarUsuario(Usuario usuario) {
		Boolean existe = usuarioRepository.existsById(usuario.getId());
		if(existe) {
			usuarioRepository.save(usuario);
			return "Usuario actualizado";
		}
		return "Usuario no actualizado";
	}
//--------------------Obtener----------------------------------	
	@Override
	public Usuario obtenerUsuario(Long id) {
		Boolean existe = usuarioRepository.existsById(id);
		if(existe) {
		Usuario user = usuarioRepository.findById(id).get();
		return user;	
		}
		return null;
	}
//--------------------ObtenerLista----------------------------------
	@Override
	public List<Usuario> obtenerListaUsuarios() {
		return usuarioRepository.findAll();
	}
}

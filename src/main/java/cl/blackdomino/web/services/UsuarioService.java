package cl.blackdomino.web.services;

import java.util.List;

import cl.blackdomino.web.models.Usuario;

public interface UsuarioService {
	
	public Usuario guardarUsuario(Usuario usuario);
	public String eliminarUsuario(Long id);
	public String actualizarUsuario(Usuario usuario);
	public Usuario obtenerUsuario(Long id);
	public List<Usuario> obtenerListaUsuarios();

}

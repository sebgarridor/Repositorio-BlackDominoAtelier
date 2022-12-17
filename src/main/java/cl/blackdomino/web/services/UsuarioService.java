package cl.blackdomino.web.services;

import java.util.List;

import cl.blackdomino.web.models.Usuario;

public interface UsuarioService {
	
	//registro usuario
	public Boolean guardarUsuario(Usuario usuario);
	
	//login usuario
	public Boolean ingresoUsuario(String correo, String password);
	//existencia de corre
	public Usuario obtenerCorreoUsuario(String correo);
	
	public String eliminarUsuario(Long id);
	public String actualizarUsuario(Usuario usuario);
	public Usuario obtenerUsuario(Long id);
	public List<Usuario> obtenerListaUsuarios();

}

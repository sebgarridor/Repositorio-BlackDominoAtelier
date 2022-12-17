package cl.blackdomino.web.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Usuario;
import cl.blackdomino.web.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired // inyección
	private UsuarioRepository usuarioRepository;

//--------------------Guardar (Registro)----------------------------------
	@Override
	public Boolean guardarUsuario(Usuario usuario) {
		
		//validar el usuario ( si existe igual correo)
		//lo llamamos(instanciamos)
		Usuario retornoUsuario = usuarioRepository.findByCorreo(usuario.getCorreo());
		
		//si no existe lo registramos
		if(retornoUsuario == null) {
			
			//encriptamos contraseña
			String passHashed = BCrypt.hashpw(usuario.getPassword(), BCrypt.gensalt());
			
			//reemplazamos valor
			usuario.setPassword(passHashed);
			
			//guardamos el usuario
			usuarioRepository.save(usuario);
			
			return true;
		}else {
			return false;
		}
		
		
	}
	
	//--------------------Ingreso(Login)----------------------------------
	@Override
	public Boolean ingresoUsuario(String correo, String password) {
		
//en una instancia de usuario buscamos correo para saber si existe el usuario
		Usuario usuario = usuarioRepository.findByCorreo(correo);
		
		//verificamos si existe ese usuario
		if(usuario != null) {//si existe el usuario
			
			//primero comparamos contraseñas
			boolean resultadoPwd = BCrypt.checkpw(password, usuario.getPassword());
			 
			if(resultadoPwd) {//si son iguales
				return true;
				
			}else {//si son distintas
				return false;
				
				
			}
			
		}else {//no existe el correo en la base de datos
			return false;
			
		}
		
	}
	
	
	//--------------------Obtener correo----------------------------------
	@Override
	public Usuario obtenerCorreoUsuario(String correo) {
		return usuarioRepository.findByCorreo(correo);
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

package cl.blackdomino.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.blackdomino.web.models.Usuario;
import cl.blackdomino.web.services.UsuarioServiceImpl;

@RestController
public class UsuarioApiRestController {
	@Autowired
	private UsuarioServiceImpl usuarioServiceImpl;
	
	@RequestMapping ("/guardar/usuarios")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		
		// http://localhost:8080/guardar/usuarios
		
		/* nombre: "sebastian"
		 * apellido: "garrido"
		 * correo: "q@q.com"
		 * telefono: 2932391
		 * 
		 * 
		 */
		return usuarioServiceImpl.guardarUsuario(usuario); // "Usuario Guardado"
				
	}
	
	@RequestMapping("/eliminar/usuario")
	public String eliminarUsuario(@RequestParam(value="id",required = false)Long id) {
		return usuarioServiceImpl.eliminarUsuario(id);
	}

	@RequestMapping("/actualizar/usuario")
	public String actualizarUsuario(@RequestBody Usuario usuario) {
		//validacion logica
		if(usuario.getId()!=null) {
			String mensaje = usuarioServiceImpl.actualizarUsuario(usuario);
			return mensaje;
		}
		return "No se actulizara ningun usuario";
	}
	
	@RequestMapping("/obtener/usuario")
	public Usuario obtenerUsuario(@RequestParam(value="id",required = true) Long id) {
		return usuarioServiceImpl.obtenerUsuario(id);
	}
	
	//listar todos los usuarios
		@GetMapping("/listar/usuarios")
		public List<Usuario> obtenerListaUsuarios(){
			return usuarioServiceImpl.obtenerListaUsuarios();
		}
}

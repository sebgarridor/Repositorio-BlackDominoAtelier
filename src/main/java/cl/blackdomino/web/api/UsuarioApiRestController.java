package cl.blackdomino.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
		 * 
		 * 
		 */
		return usuarioServiceImpl.guardarUsuario(usuario); // "Usuario Guardado"
		
	}
	

}

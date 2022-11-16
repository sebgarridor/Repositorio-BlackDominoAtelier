package cl.blackdomino.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.blackdomino.web.models.Administradores;
import cl.blackdomino.web.services.AdministradorServiceImpl;

@RestController
public class AdministradorApiRestController {
	@Autowired
	private AdministradorServiceImpl administradorServiceImpl;
	
	@RequestMapping ("/guardar/administradores")
	public Administradores guardarAdministrador(@RequestBody Administradores administrador) {
		
		// http://localhost:8080/guardar/usuarios
		
		/* nombre: "sebastian"
		 * apellido: "garrido"
		 * correo: "q@q.com"
		 * telefono: 2932391
		 * 
		 */
		
		return administradorServiceImpl.guardarAdministrador(administrador); // "Administrador guardado"
			
	
	}
}

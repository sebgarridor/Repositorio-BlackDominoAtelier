package cl.blackdomino.web.api;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.blackdomino.web.models.Rol;
import cl.blackdomino.web.services.RolServiceImpl;

@RestController
public class RolApiRestController {
	@Autowired
	private RolServiceImpl rolServiceImpl;
	
	@RequestMapping ("/guardar/rol")
	public Rol guardarRol(@RequestBody Rol rol) {
		// http://localhost:9080/guardar/rol
		
		/*
		 * "rol": "xl"
		 */
		
		return rolServiceImpl.guardarRol(rol);
		
	}
	//eliminar
	
	@RequestMapping("/eliminar/rol")
	public String eliminarRol(@RequestParam(value = "id", required = false) Long id) {
		return rolServiceImpl.eliminarRol(id);
	}
	
	//actualizar
	@RequestMapping("/actualizar/rol")
	public String actualizarRol(@RequestBody Rol rol) {
		if (rol.getId() != null) {
			String mensaje = rolServiceImpl.actualizarRol(rol);
			return mensaje;
		}
		return "El rol no se actualizara";
	}
	
	//obtener
	@RequestMapping("/obtener/rol")
	public Rol obtenerRol(@RequestParam(value = "id", required = false) Long id) {
		Rol mensaje = rolServiceImpl.obtenerRol(id);
		return mensaje;
	}
	//obtenerLista
	@GetMapping("/listar/roles")
	public List<Rol> obtenerListaRol(){
		return rolServiceImpl.obtenerListaRol();
	}

}

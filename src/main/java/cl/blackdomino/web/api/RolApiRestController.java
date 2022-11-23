package cl.blackdomino.web.api;

import java.util.List;
import java.util.Optional;

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
	
	@RequestMapping ("guardar/roles")
	public Rol guardarRol(@RequestBody Rol rol) {
		// http://localhost:9080/guardar/rol
		
		/*
		 * "rol": "xl"
		 */
		
		return rolServiceImpl.guardarRol(rol);
		
	}
	//eliminar
	
	@RequestMapping("/eliminar/roles")
	public String eliminarRol(@RequestParam(value = "id", required = false) Long id) {
		return rolServiceImpl.eliminarRol(id);
	}
	
	//actualizar
	@RequestMapping("/actualizar/roles")
	public String actualizarRol(@RequestBody Rol rol) {
		if (rol.getId() != null) {
			String mensaje = rolServiceImpl.actualizarRol(rol);
			return mensaje;
		}
		return "El rol no se actualizara";
	}
	
	//obtener
	@RequestMapping("/obtener/roles")
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

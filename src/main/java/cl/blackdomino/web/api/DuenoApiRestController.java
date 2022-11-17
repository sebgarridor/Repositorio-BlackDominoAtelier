package cl.blackdomino.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.blackdomino.web.models.Dueno;
import cl.blackdomino.web.services.DuenoServiceImpl;

@RestController
public class DuenoApiRestController {
	
	@Autowired
	private DuenoServiceImpl duenoServiceImpl;
	
	@RequestMapping ("/guardar/dueno")
	
	// http://localhost:8080/guardar/dueno
	public Dueno agregarDueno(@RequestBody Dueno dueno) {
		
		return duenoServiceImpl.agregarDueno(dueno);
		
	}
	
	@RequestMapping("/eliminar/dueno")
	
	// http://localhost:8080/eliminar/dueno?id=x
	public String eliminarDueno(@RequestParam(value="id", required = false) Long id) {
		
		return duenoServiceImpl.eliminarDueno(id);
		
	}
	
	@RequestMapping("/actualizar/dueno")
	public String actualizarDueno(@RequestBody Dueno dueno) {
		
		// http://localhost:8080/actualizar/dueno
		
		if(dueno.getId()!=null) {
			String mensaje = duenoServiceImpl.actualizarDueno(dueno);
			return mensaje;
		}
		return "No se actualizó los datos del dueno";
	}

}

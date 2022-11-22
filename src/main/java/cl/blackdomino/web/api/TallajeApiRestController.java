package cl.blackdomino.web.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.blackdomino.web.models.Tallaje;
import cl.blackdomino.web.services.TallajeServiceImpl;


@RestController
public class TallajeApiRestController {
	@Autowired
	private TallajeServiceImpl tallajeServiceImpl;
	
	@RequestMapping ("guardar/tallaje")
	public Tallaje guardarTallaje(@RequestBody Tallaje tallaje) {
		// http://localhost:9080/guardar/tallaje
		
		/*
		 * "tallaje": "xl"
		 */
		
		return tallajeServiceImpl.guardarTallaje(tallaje);
		
	}
	//eliminar
	
	@RequestMapping("/eliminar/tallaje")
	public String eliminarTallaje(@RequestParam(value = "id", required = false) Long id) {
		return tallajeServiceImpl.eliminarTallaje(id);
	}
	
	//actualizar
	@RequestMapping("/actualizar/tallaje")
	public String actualizarTallaje(@RequestBody Tallaje tallaje) {
		if (tallaje.getId() != null) {
			String mensaje = tallajeServiceImpl.actualizarTallaje(tallaje);
			return mensaje;
		}
		return "El tallaje no se actualizara";
	}
	
	//obtener
	@RequestMapping("/obtener/tallaje")
	public Tallaje obtenerTallaje(@RequestParam(value = "id", required = false) Long id) {
		Tallaje mensaje = tallajeServiceImpl.obtenerTallaje(id);
		return mensaje;
	}
	//obtenerLista
	@GetMapping("/listar/tallaje")
	public List<Tallaje> obtenerListaTallaje(){
		return tallajeServiceImpl.obtenerListaTallaje();
	}

}

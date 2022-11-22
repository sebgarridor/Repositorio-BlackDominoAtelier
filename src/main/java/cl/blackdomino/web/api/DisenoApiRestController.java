package cl.blackdomino.web.api;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.blackdomino.web.models.Diseno;
import cl.blackdomino.web.services.DisenoServiceImpl;

@RestController
public class DisenoApiRestController {

	@Autowired
	private DisenoServiceImpl disenoServiceImpl;

	// -----------------------Guardar--------------------------------------------------------------------------
	@RequestMapping("guardar/diseno")
	public Diseno guardarDiseno(@RequestBody Diseno diseno) {
		// http://localhost:9080/guardar/disenos
		return disenoServiceImpl.guardarDiseno(diseno);

	}

	// -----------------------Eliminar--------------------------------------------------------------------------
	@RequestMapping("/eliminar/diseno")
	public String eliminarDiseno(@RequestParam(value = "id", required = false) Long id) {
		return disenoServiceImpl.eliminarDiseno(id);
	}

// -----------------------Actualizar--------------------------------------------------------------------------
	@RequestMapping("/actualizar/diseno")
	public String actualizarDiseno(@RequestBody Diseno diseno) {
		if (diseno.getId() != null) {
			disenoServiceImpl.actualizarDiseno(diseno);
			String mensaje = disenoServiceImpl.actualizarDiseno(diseno);
			return mensaje;
		}
		return "El diseño no se actualizará";
	}
//-----------------------Obtener--------------------------------------------------------------------------

	@RequestMapping("/obtener/diseno")
	public Optional<Diseno> obtenerDiseno(@RequestParam(value = "id", required = false) Long id) {
		Optional<Diseno> mensaje = disenoServiceImpl.obtenerDiseno(id);
		return mensaje;
	}

//--------------------ObtenerLista----------------------------------
	@GetMapping("/listar/disenos")
	public List<Diseno> obtenerListaDisenos() {
		return disenoServiceImpl.obtenerListaDisenos();
	}
}

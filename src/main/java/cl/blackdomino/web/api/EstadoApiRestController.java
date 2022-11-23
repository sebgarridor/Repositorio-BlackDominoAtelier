package cl.blackdomino.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.blackdomino.web.models.Estado;
import cl.blackdomino.web.services.EstadoServiceImpl;

@RestController
public class EstadoApiRestController {

	@Autowired
	private EstadoServiceImpl estadoServiceImpl;

	// Guardar
	@RequestMapping("/guardar/estado")
	public Estado guardarEstado(@RequestBody Estado estado) {
		return estadoServiceImpl.guardarEstado(estado);
	}

	// Eliminar
	@RequestMapping("/eliminar/estado")
	public String eliminarEstado(@RequestParam(value = "id", required = false) Long id) {
		return estadoServiceImpl.eliminarEstado(id);
	}

	// Actualizar

	@RequestMapping("actualizar/estado")
	public String actualizarEstado(@RequestBody Estado estado) {
		if (estado.getId() != null) {
			estadoServiceImpl.actualizarEstado(estado);
			String mensaje = estadoServiceImpl.actualizarEstado(estado);
			return mensaje;
		}
		return "Estado actualizado";
	}
}

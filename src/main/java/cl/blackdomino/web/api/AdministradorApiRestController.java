package cl.blackdomino.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.blackdomino.web.models.Administradores;
import cl.blackdomino.web.services.AdministradorServiceImpl;

@RestController
public class AdministradorApiRestController {
	@Autowired
	private AdministradorServiceImpl administradorServiceImpl;

	@RequestMapping("/guardar/administradores")
	public Administradores guardarAdministrador(@RequestBody Administradores administrador) {

		// http://localhost:8080/guardar/administradores

		/*
		 * password: "secret"
		 */

		return administradorServiceImpl.guardarAdministrador(administrador); // "Administrador guardado"
	}

	@RequestMapping("/eliminar/administrador")
	public String eliminarAdministador(@RequestParam(value = "id", required = false) Long id) {
		return administradorServiceImpl.eliminarAdministrador(id);
	}

	@RequestMapping("/actualizar/administrador")
	public String actualizarAdministador(@RequestBody Administradores administrador) {
		// validacion logica
		if (administrador.getId() != null) {
			String mensaje = administradorServiceImpl.actualizarAdministador(administrador);
			return mensaje;
		}
		return "No se actulizara ningun usuario";
	}

	@RequestMapping("/obtener/administrador")
	public Administradores obtenerAdministrador(@RequestParam(value = "id", required = true) Long id) {
		return administradorServiceImpl.obtenerAdministrador(id);
	}

	// listar todos los administradores
	@GetMapping("/listar/administradores")
	public List<Administradores> obtenerListaAdministradores() {
		return administradorServiceImpl.obtenerListaAdministradores();
	}
}

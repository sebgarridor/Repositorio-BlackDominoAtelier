package cl.blackdomino.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/producto")
public class ProductoControllers {

	// http://localhost:9080/producto/poleras
	@GetMapping("/poleras")
	public String mostrarPoleras() {
		return "poleras.jsp";
	}

	// http://localhost:9080/producto/polerones
	@GetMapping("/polerones")
	public String mostrarPolerones() {
		return "polerones.jsp";
	}

	// http://localhost:9080/producto/totebag
	@GetMapping("/totebag")
	public String mostrarTotes() {
		return "totebag.jsp";
	}

	// http://localhost:9080/producto/bandoleras
	@GetMapping("/bandoleras")
	public String mostrarBandoleras() {
		return "bandoleras.jsp";
	}

	@GetMapping("/tallaje")
	// http://localhost:9080/producto/tallaje
	public String mostrartallas() {
		return "tallaje.jsp";
	}
	
	@GetMapping("/colecciones")
	// http://localhost:9080/producto/colecciones
	public String mostrarcolecciones() {
		return "colecciones.jsp";
	}

}

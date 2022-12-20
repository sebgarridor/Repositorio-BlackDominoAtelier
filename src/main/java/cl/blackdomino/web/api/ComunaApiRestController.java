package cl.blackdomino.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.blackdomino.web.models.Comuna;
import cl.blackdomino.web.services.ComunaServiceImpl;

@RestController
public class ComunaApiRestController {
	
	@Autowired
	private ComunaServiceImpl comunaServiceImpl;
	
	@RequestMapping("/guardar/comuna")
	public Comuna guardarRegion(@RequestBody Comuna comuna) {
		// http://localhost:8080/guardar/comuna
		return comunaServiceImpl.guardarComuna(comuna);
	}

	@RequestMapping("/obtener/comuna")
	public Comuna obtenerRegion(@RequestParam(value="id",required = true) Long id) {
		return comunaServiceImpl.obtenerComuna(id);
	}

	@GetMapping("/listar/comunas")
	public List<Comuna> obtenerComunas() {
		return comunaServiceImpl.obtenerComunas();
	}
}

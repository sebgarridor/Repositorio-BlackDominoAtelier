package cl.blackdomino.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import cl.blackdomino.web.models.Comuna;
import cl.blackdomino.web.models.Region;
import cl.blackdomino.web.repositories.ComunaRepository;
import cl.blackdomino.web.services.ComunaServiceImpl;
import cl.blackdomino.web.services.RegionServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ComunaApiRestController {
	
	@Autowired
	private ComunaRepository comunaRepository;
	@Autowired
	private ComunaServiceImpl comunaServiceImpl;
	@Autowired
	private RegionServiceImpl regionServiceImpl;
	
	@RequestMapping("/guardar/comuna")
	public Comuna guardarRegion(@RequestBody Comuna comuna,
			@RequestParam(value="regionId",required = false) Long regionId) {
		
		Region region = regionServiceImpl.obtenerRegion(regionId);
		comuna.setRegion(region);
		
		return comunaServiceImpl.guardarComuna(comuna);
	}

	@RequestMapping("/obtener/comuna")
	public Comuna obtenerRegion(@RequestParam(value="id",required = false) Long id) {
		return comunaServiceImpl.obtenerComuna(id);
	}

	@GetMapping("/listar/comunas")
	public List<Comuna> obtenerComunas() {
		return comunaServiceImpl.obtenerComunas();
	}
	
	@RequestMapping(value = "/obtenercomunas", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Comuna> findAllByRegion(@RequestParam(value="id",required = false) Long id) {
		return comunaRepository.findAllByRegion(id);
		}
}

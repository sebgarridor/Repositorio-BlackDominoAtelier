package cl.blackdomino.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.blackdomino.web.models.Region;
import cl.blackdomino.web.services.RegionServiceImpl;

@RestController
public class RegionApiRestController {
	
@Autowired	
 private RegionServiceImpl regionServiceImpl;

@RequestMapping("/guardar/region")
public Region guardarRegion(@RequestBody Region region) {
	// http://localhost:8080/guardar/region
	return regionServiceImpl.guardarRegion(region);
}

@RequestMapping("/obtener/region")
public Region obtenerRegion(@RequestParam(value="id",required = true) Long id) {
	return regionServiceImpl.obtenerRegion(id);
}

@GetMapping("/listar/regiones")
public List<Region> obtenerRegiones() {
	return regionServiceImpl.obtenerRegiones();
}

}

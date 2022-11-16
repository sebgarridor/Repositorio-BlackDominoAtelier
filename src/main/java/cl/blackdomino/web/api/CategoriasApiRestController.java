package cl.blackdomino.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cl.blackdomino.web.models.Categorias;
import cl.blackdomino.web.services.CategoriasServiceImpl;

@RestController
public class CategoriasApiRestController {
	@Autowired
	private CategoriasServiceImpl categoriasServiceImpl;
	
	@RequestMapping ("/guardar/categoria")
	public Categorias guardarCategorias(@RequestBody Categorias categoria) {
		// http://localhost:9080/guardar/categorias
		return categoriasServiceImpl.guardarCategorias(categoria);
	}
}

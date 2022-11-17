package cl.blackdomino.web.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.blackdomino.web.models.Categorias;
import cl.blackdomino.web.services.CategoriasServiceImpl;

@RestController
public class CategoriasApiRestController {
	@Autowired
	private CategoriasServiceImpl categoriasServiceImpl;
	
	// -----------------------Guardar--------------------------------------------------------------------------
	@RequestMapping ("/guardar/categoria")
	public Categorias guardarCategoria(@RequestBody Categorias categoria) {
		// http://localhost:9080/guardar/categorias
		return categoriasServiceImpl.guardarCategoria(categoria);
	}
	// -----------------------Eliminar--------------------------------------------------------------------------
	@RequestMapping ("/eliminar/categoria")
	public String eliminarCategoria(@RequestParam(value = "id", required = false) Long id) {
		return categoriasServiceImpl.eliminarCategoria(id);
	}
	// -----------------------Actualizar--------------------------------------------------------------------------
	@RequestMapping ("/actualizar/categoria")
	public String actualizarCategoria(@RequestBody Categorias categoria) {
		if (categoria.getId()!=null) {
			categoriasServiceImpl.actualizarCategoria(categoria);
		}
		return "La categoría será actualizada";
	}
	//-----------------------Obtener--------------------------------------------------------------------------	
	@RequestMapping ("/obtener/categoria")
	public Optional<Categorias> obtenerCategoria(@RequestParam(value = "id", required = false) Long id) {
		Optional<Categorias> mensaje = categoriasServiceImpl.obtenerCategoria(id); 
		return mensaje;
	}
	//--------------------ObtenerLista----------------------------------
	@GetMapping("/listar/categorias")
	public List<Categorias> obtenerListaCategorias(){
		return categoriasServiceImpl.obtenerListaCategorias();
	}
}

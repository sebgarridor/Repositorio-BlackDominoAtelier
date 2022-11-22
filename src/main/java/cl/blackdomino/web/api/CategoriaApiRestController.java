package cl.blackdomino.web.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.blackdomino.web.models.Categoria;
import cl.blackdomino.web.services.CategoriaServiceImpl;

@RestController
public class CategoriaApiRestController {
	@Autowired
	private CategoriaServiceImpl categoriaServiceImpl;
	
	// -----------------------Guardar--------------------------------------------------------------------------
	@RequestMapping ("/guardar/categoria")
	public Categoria guardarCategoria(@RequestBody Categoria categoria) {
		// http://localhost:9080/guardar/categorias
		return categoriaServiceImpl.guardarCategoria(categoria);
	}
	// -----------------------Eliminar--------------------------------------------------------------------------
	@RequestMapping ("/eliminar/categoria")
	public String eliminarCategoria(@RequestParam(value = "id", required = false) Long id) {
		return categoriaServiceImpl.eliminarCategoria(id);
	}
	// -----------------------Actualizar--------------------------------------------------------------------------
	@RequestMapping ("/actualizar/categoria")
	public String actualizarCategoria(@RequestBody Categoria categoria) {
		if (categoria.getId()!=null) {
			categoriaServiceImpl.actualizarCategoria(categoria);
			String mensaje = categoriaServiceImpl.actualizarCategoria(categoria);
			return mensaje;
		}
		return "La categoría será actualizada";
	}
	//-----------------------Obtener--------------------------------------------------------------------------	
	@RequestMapping ("/obtener/categoria")
	public Optional<Categoria> obtenerCategoria(@RequestParam(value = "id", required = false) Long id) {
		Optional<Categoria> mensaje = categoriaServiceImpl.obtenerCategoria(id); 
		return mensaje;
	}
	//--------------------ObtenerLista----------------------------------
	@GetMapping("/listar/categorias")
	public List<Categoria> obtenerListaCategorias(){
		return categoriaServiceImpl.obtenerListaCategorias();
	}
}

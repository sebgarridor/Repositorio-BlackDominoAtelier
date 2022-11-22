package cl.blackdomino.web.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.blackdomino.web.models.Categoria;
import cl.blackdomino.web.models.Diseno;
import cl.blackdomino.web.models.Producto;
import cl.blackdomino.web.models.Tallaje;
import cl.blackdomino.web.services.CategoriaServiceImpl;
import cl.blackdomino.web.services.DisenoServiceImpl;
import cl.blackdomino.web.services.ProductoServiceImpl;
import cl.blackdomino.web.services.TallajeServiceImpl;

@RestController
public class ProductoApiRestController {
	@Autowired
	private ProductoServiceImpl productoServiceImpl;
	@Autowired
	private CategoriaServiceImpl categoriaServiveImpl;
	@Autowired
	private TallajeServiceImpl tallajeServiveImpl;
	@Autowired
	private DisenoServiceImpl disenoServiveImpl;

// -----------------------Guardar--------------------------------------------------------------------------
	@RequestMapping("/guardar/producto")
	public Producto guardarProducto(@RequestBody Producto producto,
			@RequestParam(value = "categoriaId", required = true) Long CategoriaId,
			@RequestParam(value = "tallajeId", required = true) Long TallajeId,
			@RequestParam(value = "disenoId", required = true)Long DisenoId) {
		Categoria categoria = categoriaServiveImpl.obtenerCategoria(CategoriaId);
		producto.setCategoria(categoria);
		Tallaje tallaje = tallajeServiveImpl.obtenerTallaje(TallajeId);
		producto.setTallaje(tallaje);
		Diseno diseno = disenoServiveImpl.obtenerDiseno(DisenoId);
		producto.setDiseno(diseno);
		// http://localhost:9080/guardar/productos
		/*
		 * nombre: "Totebag evangelion negra" precio: "10000"
		 *
		 */
		return productoServiceImpl.guardarProducto(producto);
		
		//

	}

// -----------------------Eliminar--------------------------------------------------------------------------
	@RequestMapping("/eliminar/producto")
	public String eliminarProducto(@RequestParam(value = "id", required = false) Long id) {
		return productoServiceImpl.eliminarProducto(id);
	}

// -----------------------Actualizar--------------------------------------------------------------------------
	@RequestMapping("/actualizar/producto")
	public String actualizarProducto(@RequestBody Producto producto) {
		if (producto.getId() != null) {
			productoServiceImpl.actualizarProducto(producto);
			String mensaje = productoServiceImpl.actualizarProducto(producto);
			return mensaje;
		}
		return "El producto no se actualizará";
	}

// -----------------------Obtener--------------------------------------------------------------------------
	@RequestMapping("/obtener/producto")
	public Producto obtenerProducto(@RequestParam(value = "id", required = false) Long id) {
		Producto mensaje = productoServiceImpl.obtenerProducto(id);
		return mensaje;
	}

//--------------------ObtenerLista----------------------------------
	@GetMapping("/listar/producto")
	public List<Producto> obtenerListaProductos() {
		return productoServiceImpl.obtenerListaProductos();
	}
}

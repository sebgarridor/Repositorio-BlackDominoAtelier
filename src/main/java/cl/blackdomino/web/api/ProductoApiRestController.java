package cl.blackdomino.web.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.blackdomino.web.models.Producto;
import cl.blackdomino.web.services.ProductoServiceImpl;

@RestController
public class ProductoApiRestController {
	@Autowired
	private ProductoServiceImpl productoServiceImpl;

// -----------------------Guardar--------------------------------------------------------------------------
	@RequestMapping("/guardar/producto")
	public Producto guardarProducto(@RequestBody Producto producto) {
		// http://localhost:9080/guardar/productos
		/*
		 * nombre: "Totebag evangelion negra" precio: "10000"
		 *
		 */
		return productoServiceImpl.guardarProducto(producto); //

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
	public Optional<Producto> obtenerProducto(@RequestParam(value = "id", required = false) Long id) {
		Optional<Producto> mensaje = productoServiceImpl.obtenerProducto(id);
		return mensaje;
	}

//--------------------ObtenerLista----------------------------------
	@GetMapping("/listar/producto")
	public List<Producto> obtenerListaProductos() {
		return productoServiceImpl.obtenerListaProductos();
	}
}

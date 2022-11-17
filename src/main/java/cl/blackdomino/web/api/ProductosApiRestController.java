package cl.blackdomino.web.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.blackdomino.web.models.Productos;
import cl.blackdomino.web.services.ProductosServiceImpl;

@RestController
public class ProductosApiRestController {
	@Autowired
	private ProductosServiceImpl productosServiceImpl;
// -----------------------Guardar--------------------------------------------------------------------------
	@RequestMapping ("/guardar/producto")
	public Productos guardarProducto(@RequestBody Productos producto) {
		// http://localhost:9080/guardar/productos
		/* nombre: "Totebag evangelion negra"
		 * precio: "10000"
		 *
		 */
		return productosServiceImpl.guardarProducto(producto); // 
		
	}
// -----------------------Eliminar--------------------------------------------------------------------------
		@RequestMapping("/eliminar/producto")
		public String eliminarProducto(@RequestParam(value = "id", required = false) Long id) {
			return productosServiceImpl.eliminarProducto(id);
		}

// -----------------------Actualizar--------------------------------------------------------------------------
		@RequestMapping("/actualizar/producto")
		public String actualizarProducto(@RequestBody Productos producto) {
			if (producto.getId() != null) {
				productosServiceImpl.actualizarProducto(producto);
			}
			return "El producto no se actualizará";
		}
// -----------------------Obtener--------------------------------------------------------------------------
		@RequestMapping("/obtener/producto")
		public Optional<Productos> obtenerProducto(@RequestParam(value = "id", required = false) Long id) {
			Optional<Productos> mensaje = productosServiceImpl.obtenerProducto(id);
			return mensaje;
		}
//--------------------ObtenerLista----------------------------------
		@RequestMapping("/listar/producto")
		public List<Productos> obtenerListaProductos(){
			return productosServiceImpl.obtenerListaProductos();
		}
}
	
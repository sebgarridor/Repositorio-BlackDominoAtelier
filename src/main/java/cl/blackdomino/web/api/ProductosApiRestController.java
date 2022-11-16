package cl.blackdomino.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.blackdomino.web.models.Productos;
import cl.blackdomino.web.services.ProductosServiceImpl;

@RestController
public class ProductosApiRestController {
	@Autowired
	private ProductosServiceImpl productosServiceImpl;
	
	@RequestMapping ("/guardar/productos")
	public Productos guardarProductos(@RequestBody Productos producto) {
		
		
		// http://localhost:9080/guardar/productos
		
		/* nombre: "Totebag evangelion negra"
		 * precio: "10000"
		 *
		 * 
		 * 
		 * 
		 * 
		 */
		return productosServiceImpl.guardarProductos(producto); // 
		
	}
}
	
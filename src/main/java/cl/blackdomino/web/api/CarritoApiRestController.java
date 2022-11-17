package cl.blackdomino.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.blackdomino.web.models.Carrito;
import cl.blackdomino.web.services.CarritoServiceImpl;

@RestController
public class CarritoApiRestController {
	
	@Autowired
	private CarritoServiceImpl carritoServiceImpl;
	
	@RequestMapping ("/guardar/carrito")
	public Carrito agregarCarrito(@RequestBody Carrito carrito) {
		
		return carritoServiceImpl.agregarCarrito(carrito); //Carrito agregado
		
	}
	
	@RequestMapping("/eliminar/carrito")
	
	// http://localhost:8080/eliminar/carrito?id=x
	public String eliminarCarrito(@RequestParam(value="id", required = false) Long id) {
		
		return carritoServiceImpl.eliminarCarrito(id);
		
	}
	
	@RequestMapping ("/actualizar/cantidad")
	public String actualizarCantidad(@RequestBody Carrito carrito) {
		
		// http://localhost:9080/actualizar/carrito
		
		if(carrito.getId()!=null) {
			String mensaje = carritoServiceImpl.actualizarCantidad(carrito);
			return mensaje;
		}
		
		return "No se actualizarán las cantidades";
		
		
	}
	
	@RequestMapping ("/ver/carrito")
	
	// http://localhost:9080/ver/carrito
	public Carrito verCarrito(@RequestParam(value="id", required = true) Long id) {
		
		return carritoServiceImpl.verCarrito(id);
	}
	
	
	
	

}

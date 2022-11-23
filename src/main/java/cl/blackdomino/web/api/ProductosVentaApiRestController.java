package cl.blackdomino.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.blackdomino.web.models.ProductosVentas;
import cl.blackdomino.web.services.ProductosVentasServiceImpl;

@RestController
public class ProductosVentaApiRestController {

	@Autowired
	private ProductosVentasServiceImpl productosVentaServiceImpl;
	
	//Guardar
	@RequestMapping("/guardar/PV")
	public ProductosVentas guardarPV(@RequestBody ProductosVentas productosVentas) {
		return productosVentaServiceImpl.guardarPV(productosVentas);
	}
	
	//Eliminar
	@RequestMapping("/eliminar/PV")
	public String eliminarPV(@RequestParam(value = "id", required = false)Long id) {
		return productosVentaServiceImpl.eliminarPV(id);
	}
	
	//Actualizar
	@RequestMapping("/actualizar/PV")
	public String actualizarPV(@RequestBody ProductosVentas productosVentas) {
		if (productosVentas.getId()!= null) {
			productosVentaServiceImpl.actualizarPV(productosVentas);
			String mensaje = productosVentaServiceImpl.actualizarPV(productosVentas);
			return mensaje;
		}
		return "Productos Ventas actualizados";
	}
	
	//Obtener
	@GetMapping("/obtener/PV")
	public ProductosVentas obtenerPV(@RequestParam(value="id", required= true) Long id) {
	 return productosVentaServiceImpl.obtenerPV(id);	
	}
	
	//ObtenerLista
	@GetMapping("/listar/PV")
	public List<ProductosVentas> listadoPV(){
		return productosVentaServiceImpl.listadoPV();
	}
} 
	
	
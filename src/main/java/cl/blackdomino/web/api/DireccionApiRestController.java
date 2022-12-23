package cl.blackdomino.web.api;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.blackdomino.web.models.Comuna;
import cl.blackdomino.web.models.Direccion;
import cl.blackdomino.web.services.ComunaServiceImpl;
import cl.blackdomino.web.services.DireccionServiceImpl;

@RestController
public class DireccionApiRestController {
	@Autowired
	private DireccionServiceImpl direccionServiceImpl;
	@Autowired
	private ComunaServiceImpl comunaServiceImpl;
	
	@RequestMapping ("/guardar/direccion")
	public Direccion guardarDireccion(@RequestBody Direccion direccion,
		@RequestParam(value = "comunaId", required = true)Long id_comuna) {
		Comuna comuna = comunaServiceImpl.obtenerComuna(id_comuna);
		direccion.setComuna(comuna);
		return direccionServiceImpl.guardarDireccion(direccion);
		
	}
	//eliminar
	
	@RequestMapping("/eliminar/direccion")
	public String eliminarDireccion(@RequestParam(value = "id", required = false) Long id) {
		return direccionServiceImpl.eliminarDireccion(id);
	}
	
	//actualizar
	@RequestMapping("/actualizar/direccion")
	public String actualizarDireccion(@RequestBody Direccion direccion) {
		if (direccion.getId() != null) {
			String mensaje = direccionServiceImpl.actualizarDireccion(direccion);
			return mensaje;
		}
		return "La direccion no se actualizara";
	}
	
	//obtener
	@RequestMapping("/obtener/direccion")
	public Direccion obtenerDireccion(@RequestParam(value = "id", required = false) Long id) {
		Direccion mensaje = direccionServiceImpl.obtenerDireccion(id);
		return mensaje;
	}
	//obtenerLista
	@GetMapping("/listar/direcciones")
	public List<Direccion> obtenerListaDireccion(){
		return direccionServiceImpl.obtenerListaDireccion();
	}
}

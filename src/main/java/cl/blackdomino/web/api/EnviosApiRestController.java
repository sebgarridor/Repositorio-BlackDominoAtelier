package cl.blackdomino.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.blackdomino.web.models.Envios;
import cl.blackdomino.web.services.EnviosServiceImpl;

@RestController
public class EnviosApiRestController {

	@Autowired
	private EnviosServiceImpl esImpl;
	
	@RequestMapping("/guardar/envio")
	public Envios guardarEnvios(@RequestBody Envios envios) {
		
		//tipoEnvio
		//costoEnvio
		//regionEnvio
		//subTotal
		//total
		
		return esImpl.guardarEnvio(envios);
		
	}
	
	@RequestMapping("/eliminar/envio")
	public String eliminarEnvios(@RequestParam(value="id",required=false) Long id) {
		
		String mensaje = esImpl.eliminarEnvio(id);
		
		return mensaje;
		
	}
	
	@RequestMapping("/actualizar/envio")
	public String actualizarEnvio(@RequestBody Envios envios) {
		
		String mensaje = esImpl.actualizarEnvio(envios);
		
		return mensaje;
		
	}
	
	@RequestMapping("/obtener/envio")
	public Envios obtenerEnvio(Long id) {
		return esImpl.obtenerEnvio(id);
		
	}
	
	
	@RequestMapping("/listado/envios")
	public List<Envios> listadoEnvios(){
		
		
		return esImpl.listadoEnvios();
		
	}
}

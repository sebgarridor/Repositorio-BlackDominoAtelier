package cl.blackdomino.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.blackdomino.web.models.Envio;
import cl.blackdomino.web.services.EnvioServiceImpl;

@RestController
public class EnvioApiRestController {
	@Autowired
	private EnvioServiceImpl envioServiceImpl;
	
	@RequestMapping("/guardar/envio")
	public Envio guardarEnvio(@RequestBody Envio envio) {
		return envioServiceImpl.guardarEnvio(envio);
	}

	@RequestMapping("/eliminar/envio")
	public String eliminarEnvio(@RequestParam(value="id",required=false) Long id) {
		String mensaje = envioServiceImpl.eliminarEnvio(id);
		return mensaje;
	}
	
	@RequestMapping("/actualizar/envio")
	public String actualizarEnvio(@RequestBody Envio envio) {
		return envioServiceImpl.actualizarEnvio(envio);
	}
	
	@RequestMapping("/obtener/envio")
	public Envio obtenerEnvio(@RequestParam(value="id",required=false) Long id) {
		return envioServiceImpl.obtenerEnvio(id);
	}
	
	@RequestMapping("/listado/envios")
	public List<Envio> listaEnvios(){
		return envioServiceImpl.listadoEnvios();
	}
	
}


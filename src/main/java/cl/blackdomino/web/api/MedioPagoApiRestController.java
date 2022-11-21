package cl.blackdomino.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import cl.blackdomino.web.models.MedioPago;
import cl.blackdomino.web.services.MedioPagoServiceImpl;

@RestController
public class MedioPagoApiRestController {
	
	@Autowired
	private MedioPagoServiceImpl mpsImpl;
	
	@RequestMapping("/guardar/medioPago")
	public MedioPago guardarMedioPago(@RequestBody MedioPago medioPago) {
		
		//tipoEnvio
		//costoEnvio
		//regionEnvio
		//subTotal
		//total
		
		return mpsImpl.guardarMedioPago(medioPago);
		
	}

	
	@RequestMapping("/eliminar/medioPago")
	public String eliminarMedioPago(@RequestParam(value="id",required=false) Long id) {
		
		String mensaje = mpsImpl.eliminarMedioPago(id);
		
		return mensaje;
		
	}
}

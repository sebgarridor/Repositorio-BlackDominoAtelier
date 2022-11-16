package cl.blackdomino.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.blackdomino.web.models.Tallaje;
import cl.blackdomino.web.services.TallajeServiceImpl;

@RestController
public class TallajeApiRestController {
	
	@Autowired
	private TallajeServiceImpl tallajeServiceImpl;
	
	@RequestMapping ("guardar/tallaje")
	public Tallaje guardarTalla(@RequestBody Tallaje tallaje) {
		
		
		// http://localhost:9080/guardar/tallaje
		
		/*
		 * "tallaje": "xl"
		 */
		
		return tallajeServiceImpl.guardarTalla(tallaje);
		
	}
	
	

}

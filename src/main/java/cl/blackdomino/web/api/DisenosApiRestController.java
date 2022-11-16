package cl.blackdomino.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.blackdomino.web.models.Disenos;
import cl.blackdomino.web.services.DisenosServiceImpl;

@RestController
public class DisenosApiRestController {
	
	@Autowired
	private DisenosServiceImpl disenosServiceImpl;
	
	@RequestMapping ("guardar/disenos")
	public Disenos guardarDiseno(@RequestBody Disenos disenos) {
		
		
		// http://localhost:9080/guardar/disenos
		
		return disenosServiceImpl.guardarDiseno(disenos);
		
	}

}

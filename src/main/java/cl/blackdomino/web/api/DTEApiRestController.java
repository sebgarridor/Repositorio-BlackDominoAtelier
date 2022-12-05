package cl.blackdomino.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.blackdomino.web.models.DTE;
import cl.blackdomino.web.services.DTEServiceImpl;

@RestController
public class DTEApiRestController {
	
	@Autowired
	private DTEServiceImpl dtesImpl;
	
	//guardar
	@RequestMapping("/guardar/dte")
	public DTE guardarDTE(@RequestBody DTE dte) {
		return dtesImpl.guardarDTE(dte);
	}
	
	//eliminar
	@RequestMapping("/eliminar/dte")
	public String eliminarDTE(@RequestParam(value="id",required=false) Long id) {
		return dtesImpl.eliminarDTE(id);
	}
	
	//actualizar
	@RequestMapping("/actualizar/dte")
	public String actualizarDTE(@RequestBody DTE dte) {
		return dtesImpl.actualizarDTE(dte);
	}
	
	//obtener
	@RequestMapping("/obtener/dte")
	public DTE obtenerDTE(@RequestParam (value="id",required=false) Long id) {
		return dtesImpl.obtenerDTE(id);
	}
	
	//listar
	@RequestMapping("/listado/dte")
	public List<DTE> listadoDTE(){
		return dtesImpl.listadoDTE();
	}

}

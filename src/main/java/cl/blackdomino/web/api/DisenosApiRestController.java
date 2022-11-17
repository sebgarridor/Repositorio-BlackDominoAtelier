package cl.blackdomino.web.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.blackdomino.web.models.Disenos;
import cl.blackdomino.web.services.DisenosServiceImpl;

@RestController
public class DisenosApiRestController {
	
	@Autowired
	private DisenosServiceImpl disenosServiceImpl;
	//-----------------------Guardar--------------------------------------------------------------------------
	@RequestMapping ("guardar/diseno")
	public Disenos guardarDiseno(@RequestBody Disenos diseno) {
		// http://localhost:9080/guardar/disenos
		return disenosServiceImpl.guardarDiseno(diseno);
		
	}
	//-----------------------Eliminar--------------------------------------------------------------------------
	@RequestMapping("/eliminar/diseno")
	public String eliminarDiseno(@RequestParam (value = "id", required = false)Long id) {
		return disenosServiceImpl.eliminarDiseno(id);
	}
	
	//-----------------------Actualizar--------------------------------------------------------------------------
	@RequestMapping("/actualizar/diseno")
	public String actualizarDiseno(@RequestBody Disenos diseno) {
		if (diseno.getId()!=null) {
			disenosServiceImpl.actualizarDiseno(diseno);
		}
		return "El diseño no se actualizará";
	}
//-----------------------Obtener--------------------------------------------------------------------------
	@RequestMapping("/obtener/diseno")
	public Optional<Disenos> obtenerDiseno(@RequestParam(value="id",required = false) Long id
			){
		
		Optional<Disenos> mensaje = disenosServiceImpl.obtenerDiseno(id);
				return mensaje;			
	}
//--------------------ObtenerLista----------------------------------
	@GetMapping("/listar/disenos")
	public List<Disenos> ObtenerListaUsuarios(){
		return disenosServiceImpl.obtenerListaDisenos();
	}
}


package cl.blackdomino.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Disenos;
import cl.blackdomino.web.repositories.DisenosRepository;

@Service
public class DisenosServiceImpl implements DisenosService{
	
	
	@Autowired //inyección
	private DisenosRepository disenosRepository;
	
	
//--------------------Guardar----------------------------------
	@Override
	public Disenos guardarDiseno(Disenos diseno) {
		
		return disenosRepository.save(diseno);
	}
//--------------------Eliminar----------------------------------
	@Override
	public String eliminarDiseno(Long id) {
		Boolean existe = disenosRepository.existsById(id);
		if (existe) {
			disenosRepository.deleteById(id);
		} else {
			return "El diseño no existe";
		}
		existe = disenosRepository.existsById(id);
		if (existe) {
			return "El diseño no fue eliminado";
		}
		return "El diseño fue eliminado";
	}
	
//--------------------Actualizar----------------------------------
	@Override
	public String actualizarDiseno(Disenos diseno) {
		Boolean existe = disenosRepository.existsById(diseno.getId());
		if (existe) {
			disenosRepository.save(diseno);
			return "Diseño actualizado";
		}
		return "Diseño no actualizado";
	}
//--------------------Obtener----------------------------------
	@Override
	public Optional<Disenos> obtenerDiseno(Long id) {
		Optional<Disenos> mensaje = disenosRepository.findById(id);
		return mensaje;
	}
	
//--------------------ObtenerLista----------------------------------
	@Override
	public List<Disenos> obtenerListaDisenos() {
		return disenosRepository.findAll();
	}



}

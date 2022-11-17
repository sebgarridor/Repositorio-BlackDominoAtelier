package cl.blackdomino.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.blackdomino.web.models.Dueno;
import cl.blackdomino.web.repositories.DuenoRepository;

@Service
public class DuenoServiceImpl implements DuenoService{
	
	@Autowired
	private DuenoRepository duenoRepository;

	
	// AGREGAR DUENO
	@Override
	public Dueno agregarDueno(Dueno dueno) {
		
		return duenoRepository.save(dueno);
	}

	
	// ACTUALIZAR DATOS DUENO
	@Override
	public String actualizarDueno(Dueno dueno) {
		Boolean existe = duenoRepository.existsById(dueno.getId());
		
		if(existe) {
			duenoRepository.save(dueno);
			return "Los datos del dueno han sido actualizados";
		}
		
		return "Dueno creado";
	}

	// ELIMINAR DUENO
	@Override
	public String eliminarDueno(Long id) {
		
		Boolean existe = duenoRepository.existsById(id);
		
		if(existe) {
			
			duenoRepository.deleteById(id);
		}else { 
			return "El dueno no existe";
		}
		
		existe = duenoRepository.existsById(id);
		
		if(existe) {
			return "Dueno no eliminado";
		}
		return "El dueno fue eliminado";
	}

	// LEER DATOS DUENO
	@Override
	public Dueno verDatos(Long id) {
		Boolean existe = duenoRepository.existsById(id);
		
		if(existe ) {
			Dueno duenodueno = duenoRepository.findById(id).get();
			return duenodueno;
		}
		
		return null;
	}

}

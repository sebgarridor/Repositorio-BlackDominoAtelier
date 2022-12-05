package cl.blackdomino.web.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Diseno;
import cl.blackdomino.web.repositories.DisenoRepository;

@Service
public class DisenoServiceImpl implements DisenoService{
	
	
	@Autowired //inyección
	private DisenoRepository disenoRepository;
	
//--------------------Guardar----------------------------------
	@Override
	public Diseno guardarDiseno(Diseno diseno) {
		return disenoRepository.save(diseno);
	}
//--------------------Eliminar----------------------------------
	@Override
	public String eliminarDiseno(Long id) {
		Boolean existe = disenoRepository.existsById(id);
		if (existe) {
			disenoRepository.deleteById(id);
		} else {
			return "El diseño no existe";
		}
		existe = disenoRepository.existsById(id);
		if (existe) {
			return "El diseño no fue eliminado";
		}
		return "El diseño fue eliminado";
	}
//--------------------Actualizar----------------------------------
	@Override
	public String actualizarDiseno(Diseno diseno) {
		Boolean existe = disenoRepository.existsById(diseno.getId());
		if (existe) {
			disenoRepository.save(diseno);
			return "Diseño actualizado";
		}
		return "Diseño no actualizado";
	}
//--------------------Obtener----------------------------------
	@Override
	public Diseno obtenerDiseno(Long id) {
		Boolean existe = disenoRepository.existsById(id);
		if(existe) {
		Diseno mensaje = disenoRepository.findById(id).get();
		return mensaje;	
		}
		return null;
	}
//--------------------ObtenerLista----------------------------------
	@Override
	public List<Diseno> obtenerListaDisenos() {
		return disenoRepository.findAll();
	}



}

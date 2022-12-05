package cl.blackdomino.web.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Tallaje;
import cl.blackdomino.web.repositories.TallajeRepository;

@Service
public class TallajeServiceImpl implements TallajeService {
	
	@Autowired //inyección
	private TallajeRepository tallajeRepository;
	
//--------------------Guardar----------------------------------
	@Override
	public Tallaje guardarTallaje(Tallaje tallaje) {
		return tallajeRepository.save(tallaje);
	}
//--------------------Eliminar----------------------------------
	@Override
	public String eliminarTallaje(Long id) {
		Boolean existe = tallajeRepository.existsById(id);
		if(existe) {
			tallajeRepository.deleteById(id);
		} else {
			return "El tallaje no existe";
		}
		existe = tallajeRepository.existsById(id);
		if(existe){
			return "El tallaje no fue eliminado";
		}
		return "El tallaje fue eliminado";
	}
//--------------------Actualizar----------------------------------
	@Override
	public String actualizarTallaje(Tallaje tallaje) {
		Boolean existe = tallajeRepository.existsById(tallaje.getId());
		if (existe) {
			tallajeRepository.save(tallaje);
			return "Tallaje actualizado";
		}
		return "Tallaje no actualizado";
	}
//--------------------Obtener----------------------------------	
	@Override
	public Tallaje obtenerTallaje(Long id) {
		Boolean existe = tallajeRepository.existsById(id);
		if(existe) {
			Tallaje mensaje = tallajeRepository.findById(id).get();
		return mensaje;
		}
		return null;
	}
//--------------------ObtenerLista----------------------------------
	@Override
	public List<Tallaje> obtenerListaTallaje() {
		return tallajeRepository.findAll();
	}
	
	

}

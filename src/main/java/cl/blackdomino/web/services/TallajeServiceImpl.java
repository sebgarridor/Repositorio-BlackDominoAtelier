package cl.blackdomino.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Tallaje;
import cl.blackdomino.web.repositories.TallajeRepository;

@Service
public class TallajeServiceImpl implements TallajeService {
	
	@Autowired //inyección
	private TallajeRepository tallajeRepository;
	
	@Override
	public Tallaje guardarTallaje(Tallaje tallaje) {
		// TODO Auto-generated method stub
		return tallajeRepository.save(tallaje);
	}

	@Override
	public String eliminarTallaje(Long id) {
		Boolean existe = tallajeRepository.existsById(id);
		if(existe) {
			tallajeRepository.deleteById(id);
		} else {
			return "El tallaje no existe";
		}
		return "El tallaje fue eliminado";
	}

	@Override
	public String actualizarTallaje(Tallaje tallaje) {
		Boolean existe = tallajeRepository.existsById(tallaje.getId());
		if (existe) {
			tallajeRepository.save(tallaje);
			return "Tallaje actualizado";
		}
		return "Tallaje no actualizado";
	}

	@Override
	public Optional<Tallaje> obtenerTallaje(Long id) {
		Optional<Tallaje> mensaje = tallajeRepository.findById(id);
		return mensaje;
	}

	@Override
	public List<Tallaje> obtenerListaTallaje() {
		return tallajeRepository.findAll();
	}
	
	

}

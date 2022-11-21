package cl.blackdomino.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Rol;
import cl.blackdomino.web.repositories.RolRepository;

@Service
public class RolServiceImpl implements RolService{
	@Autowired //inyección
	private RolRepository rolRepository;
	
	@Override
	public Rol guardarRol(Rol rol) {
		
		return rolRepository.save(rol);
	}

	@Override
	public String eliminarRol(Long id) {
		Boolean existe = rolRepository.existsById(id);
		if(existe) {
			rolRepository.deleteById(id);
		} else {
			return "El rol no existe";
		}
		return "El rol fue eliminado";
	}

	@Override
	public String actualizarRol(Rol rol) {
		Boolean existe = rolRepository.existsById(rol.getId());
		if (existe) {
			rolRepository.save(rol);
			return "Rol actualizado";
		}
		return "Rol no actualizado";
	}

	@Override
	public Optional<Rol> obtenerRol(Long id) {
		Optional<Rol> mensaje = rolRepository.findById(id);
		return mensaje;
	}

	@Override
	public List<Rol> obtenerListaRol() {
		return rolRepository.findAll();
	}


}

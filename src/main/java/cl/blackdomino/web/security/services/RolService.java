package cl.blackdomino.web.security.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.ERole;
import cl.blackdomino.web.models.Rol;
import cl.blackdomino.web.repositories.RolRepository;



@Service
public class RolService {
	
	@Autowired
	RolRepository rolRepository;
	
	public Optional<Rol> getByRolNombre(ERole erole){
		return rolRepository.findByNombre(erole);
	}
	
	public void save(Rol rol) {
		rolRepository.save(rol);
	}

}

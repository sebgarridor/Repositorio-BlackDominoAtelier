package cl.blackdomino.utils;
//Borra o comentar después de la primera corrida


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import cl.blackdomino.web.models.ERole;
import cl.blackdomino.web.models.Rol;
import cl.blackdomino.web.security.services.RolService;

/*

@Component
public class CreateRole implements CommandLineRunner{

	@Autowired
	RolService rolService;
	
	@Override
	public void run(String... args) throws Exception {
		Rol rolAdmin = new Rol(ERole.ROLE_ADMIN);
		Rol rolUser = new Rol(ERole.ROLE_USER);
		rolService.save(rolAdmin);
		rolService.save(rolUser);
	
	}
	
}

*/
package cl.blackdomino.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Administradores;
import cl.blackdomino.web.repositories.AdministradorRepository;


@Service
public class AdministradorServiceImpl implements AdministradorService{

	@Autowired // inyección
	private AdministradorRepository administradorRepository;


	@Override
	public Administradores guardarAdministrador(Administradores administrador) {
		// TODO Auto-generated method stub
		return administradorRepository.save(administrador);
	}
	
	
	
}

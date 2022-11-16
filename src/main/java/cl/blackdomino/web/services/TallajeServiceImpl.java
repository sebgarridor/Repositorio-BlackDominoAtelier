package cl.blackdomino.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Tallaje;
import cl.blackdomino.web.repositories.TallajeRepository;

@Service
public class TallajeServiceImpl implements TallajeService {
	
	@Autowired //inyección
	private TallajeRepository tallajeRepository;
	
	@Override
	public Tallaje guardarTalla(Tallaje tallaje) {
		
		return tallajeRepository.save(tallaje);
	}
	
	

}

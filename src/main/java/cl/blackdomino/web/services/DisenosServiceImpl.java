package cl.blackdomino.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Disenos;
import cl.blackdomino.web.repositories.DisenosRepository;

@Service
public class DisenosServiceImpl implements DisenosService{
	
	
	@Autowired //inyección
	private DisenosRepository disenosRepository;
	
	@Override
	public Disenos guardarDiseno(Disenos disenos) {
		
		return disenosRepository.save(disenos);
	}

}

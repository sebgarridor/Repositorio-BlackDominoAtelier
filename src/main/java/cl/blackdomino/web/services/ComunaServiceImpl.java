package cl.blackdomino.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Comuna;
import cl.blackdomino.web.repositories.ComunaRepository;

@Service
public class ComunaServiceImpl implements ComunaService {
	@Autowired
	private ComunaRepository comunaRepository;
	
	@Override
	public Comuna guardarComuna(Comuna comuna) {
		return comunaRepository.save(comuna);
	} 

	@Override
	public Comuna obtenerComuna(Long id) {
		Boolean existe = comunaRepository.existsById(id);
		if(existe) {
			Comuna mensaje = comunaRepository.findById(id).get();
			return mensaje;
		}
		return null;
	}

	@Override
	public List<Comuna> obtenerComunas() {
		return comunaRepository.findAll();
	}

	
	
	
}

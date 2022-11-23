package cl.blackdomino.web.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Direccion;
import cl.blackdomino.web.repositories.DireccionRepository;


@Service
public class DireccionServiceImpl implements DireccionService{

	@Autowired //inyección
	private DireccionRepository direccionRepository;
	
	@Override
	public Direccion guardarDireccion(Direccion direccion) {
		
		return direccionRepository.save(direccion);
	}

	@Override
	public String eliminarDireccion(Long id) {
		Boolean existe = direccionRepository.existsById(id);
		if(existe) {
			direccionRepository.deleteById(id);
		} else {
			return "La Direccion no existe";
		
		}
		return "La Direccion fue eliminada";
	}

	@Override
	public String actualizarDireccion(Direccion direccion) {
		Boolean existe = direccionRepository.existsById(direccion.getId());
		if (existe) {
			direccionRepository.save(direccion);
			return "Direccion actualizada";
		}
		return "Direccion no actualizada";
	}

	@Override
	public Direccion obtenerDireccion(Long id) {
		Direccion mensaje = direccionRepository.findById(id).get();
		return mensaje;
	}

	@Override
	public List<Direccion> obtenerListaDireccion() {
		return direccionRepository.findAll();
	}
}

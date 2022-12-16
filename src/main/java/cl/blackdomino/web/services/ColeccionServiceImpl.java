package cl.blackdomino.web.services;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Coleccion;
import cl.blackdomino.web.repositories.ColeccionRepository;

@Service
public class ColeccionServiceImpl implements ColeccionService {
	private ColeccionRepository coleccionRepository;

	@Override
	public Coleccion guardarColeccion(Coleccion coleccion) {
		return coleccionRepository.save(coleccion);
	}
	
	
	@Override
	public String eliminarColeccion(Long id) {
		Boolean existe = coleccionRepository.existsById(id);
		if (existe) {
			coleccionRepository.deleteById(id);
		}else {
			return "La colección no existe";
		}
		existe = coleccionRepository.existsById(id);
		if(existe) {
		return "La colección no ha sido eliminada";
		}
		return "La colección fue eliminada";
	}

	@Override
	public String actualizarColeccion(Coleccion coleccion) {
		Boolean existe = coleccionRepository.existsById(coleccion.getId());
		if (existe) {
			coleccionRepository.save(coleccion);
			return "Coleccion actualizada";
		}
		
		return "No se pudo actualizar la colección";
	}							

	@Override
	public Coleccion obtenerColeccion(Long id) {
		return coleccionRepository.findById(id).get();
	}

	@Override
	public List<Coleccion> obtenerListaColeccion() {
		return coleccionRepository.findAll();
	}
}

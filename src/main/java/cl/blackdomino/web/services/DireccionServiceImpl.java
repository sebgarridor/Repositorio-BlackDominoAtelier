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
	
//--------------------Guardar----------------------------------
	@Override
	public Direccion guardarDireccion(Direccion direccion) {
		return direccionRepository.save(direccion);
	}
//--------------------Eliminar----------------------------------
	@Override
	public String eliminarDireccion(Long id) {
		Boolean existe = direccionRepository.existsById(id);
		if(existe) {
			direccionRepository.deleteById(id);
		} else {
			return "La Dirección no existe";
		}
		existe = direccionRepository.existsById(id);
		if(existe) {
			return "La dirección no fue eliminada";
		}
		return "La Dirección fue eliminada";
	}
//--------------------Actualizar----------------------------------
	@Override
	public String actualizarDireccion(Direccion direccion) {
		Boolean existe = direccionRepository.existsById(direccion.getId());
		if (existe) {
			direccionRepository.save(direccion);
			return "Dirección actualizada";
		}
		return "Dirección no actualizada";
	}
//--------------------Obtener----------------------------------
	@Override
	public Direccion obtenerDireccion(Long id) {
		Boolean existe = direccionRepository.existsById(id);
		if(existe) {
			Direccion mensaje = direccionRepository.findById(id).get();
		return mensaje;
		}
		return null;
	}
//--------------------ObtenerLista----------------------------------
	@Override
	public List<Direccion> obtenerListaDireccion() {
		return direccionRepository.findAll();
	}
}

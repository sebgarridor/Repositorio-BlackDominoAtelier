package cl.blackdomino.web.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Rol;
import cl.blackdomino.web.repositories.RolRepository;

@Service
public class RolServiceImpl implements RolService{

	@Autowired //inyección
	private RolRepository rolRepository;
	
//--------------------Guardar----------------------------------
	@Override
	public Rol guardarRol(Rol rol) {	
		return rolRepository.save(rol);
	}
//--------------------Eliminar----------------------------------
	@Override
	public String eliminarRol(Long id) {
		Boolean existe = rolRepository.existsById(id);
		if(existe) {
			rolRepository.deleteById(id);
		} else {
			return "El rol no existe";
		}
		existe = rolRepository.existsById(id);
		if(existe){
			return "Rol no eliminado";
		}
		return "El rol fue eliminado";
	}
//--------------------Actualizar----------------------------------
	@Override
	public String actualizarRol(Rol rol) {
		Boolean existe = rolRepository.existsById(rol.getId());
		if (existe) {
			rolRepository.save(rol);
			return "Rol actualizado";
		}
		return "Rol no actualizado";
	}
//--------------------Obtener----------------------------------	
	@Override
	public Rol obtenerRol(Long id) {
		Rol mensaje = rolRepository.findById(id).get();
		return mensaje;
	}
//--------------------ObtenerLista----------------------------------
	@Override
	public List<Rol> obtenerListaRol() {
		return rolRepository.findAll();
	}


}

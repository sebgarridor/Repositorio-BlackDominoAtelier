package cl.blackdomino.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Envios;
import cl.blackdomino.web.repositories.EnviosRepository;

@Service
public class EnviosServiceImpl implements EnviosService {
	//implementar interfaces->solo tienen metodos definidos

	@Autowired //inyecta informacion al objeto
	private EnviosRepository enviosRepository;

	@Override
	public Envios guardarEnvio(Envios envios) {
		
		//guardamos con el metodo save
		
		return enviosRepository.save(envios);
	}

	@Override
	public String eliminarEnvio(Long id) {
		
		// verificamos primero si existe
		Boolean existe = enviosRepository.existsById(id);
		
		if(existe) {
			
			//lo eliminamos
			enviosRepository.deleteById(id);
			
		}else {
			
			return "Ese envio no existe";
		}
		
		return "El envio fue eliminado";
	}

	@Override
	public String actualizarEnvio(Envios envios) {
		
		Boolean existe = enviosRepository.existsById(envios.getId());
		
		if(existe) {
			
			//lo guardamos
			enviosRepository.save(envios);
			
			return "El envio fue actualizado";
		}else {
			
			//lo guardamos
			enviosRepository.save(envios);
			
		}
		
		return "Se creo envio";
	}

	@Override
	public Envios obtenerEnvio(Long id) {
		
		Boolean existe = enviosRepository.existsById(id);
		
		if(existe) {
			return enviosRepository.findById(id).get();
		}
		
		return null;
	}

	@Override
	public List<Envios> listadoEnvios() {
		
		List<Envios> listado = enviosRepository.findAll();
		
		return listado;
	} 
	
	

	
}

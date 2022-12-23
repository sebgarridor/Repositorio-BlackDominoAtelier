package cl.blackdomino.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.blackdomino.web.models.Envio;
import cl.blackdomino.web.repositories.EnvioRepository;

@Service
public class EnvioServiceImpl implements EnvioService {
	@Autowired
	private EnvioRepository envioRepository;

	@Override
	public Envio guardarEnvio(Envio envio) {
		return envioRepository.save(envio);
	}

	@Override
	public String eliminarEnvio(Long id) {
		Boolean existe = envioRepository.existsById(id);
        if(existe){
            envioRepository.deleteById(id);
        }else{
            return "El envío no existe";
        }
        existe = envioRepository.existsById(id);
        if(existe){
            return "El envío se puede eliminar";
        }
        return "El envío fue eliminado";
    }

	@Override
	public String actualizarEnvio(Envio envio) {
	    Boolean existe = envioRepository.existsById(envio.getId());
        if(existe){
            envioRepository.save(envio);
        }else{
            return "El envío no se pudo actualizar";
        }
        return "El envío fue actualizado";
    }

	@Override
	public Envio obtenerEnvio(Long id) {
		Boolean existe = envioRepository.existsById(id);
    	if(existe) {
    	Envio mensaje = envioRepository.findById(id).get();
    return mensaje;	
    	}
        return null;
    }

	@Override
	public List<Envio> listadoEnvios() {
		return envioRepository.findAll();
	}

}

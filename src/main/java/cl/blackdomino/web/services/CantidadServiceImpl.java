package cl.blackdomino.web.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.blackdomino.web.models.Cantidad;
import cl.blackdomino.web.repositories.CantidadRepository;

@Service
public class CantidadServiceImpl implements CantidadService {
	
	@Autowired
	private CantidadRepository cantidadRepository;
	
	@Override
	public Cantidad guardarCantidad(Cantidad cantidad) {
		return cantidadRepository.save(cantidad);
	}

	@Override
	public String eliminarCantidad(Long id) {
		Boolean existe = cantidadRepository.existsById(id);
		if (existe) {
			cantidadRepository.deleteById(id);
		}else {
			return "No existe cantidad";
		}
		existe = cantidadRepository.existsById(id);
		if (existe) {
		return "La cantidad será eliminada";
	}
		return "La cantidad fue eliminada";
	}

	@Override
	public String actualizarCantidad(Cantidad cantidad) {
		   Boolean existe = cantidadRepository.existsById(cantidad.getId());
	        if(existe){
	            cantidadRepository.save(cantidad);
	        }else{
	            return "La cantidad no será actualizada";
	        }
	        return "La cantidad fue actualizada";
	    }

	@Override
	public Cantidad obtenerCantidad(Long id) {
		Boolean existe = cantidadRepository.existsById(id);
    	if(existe) {
    	Cantidad mensaje = cantidadRepository.findById(id).get();
    return mensaje;	
    	}
        return null;
    }

	@Override
	public List<Cantidad> listaCantidad() {
		return cantidadRepository.findAll();
	}

}

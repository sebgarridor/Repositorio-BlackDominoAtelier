package cl.blackdomino.web.services;

import org.springframework.stereotype.Service;


import cl.blackdomino.web.models.MedioPago;

@Service
public interface MedioPagosService {

	//guardamos la data
		public MedioPago guardarMedioPago(MedioPago medioPago);
		
		//eliminar la data
		public String eliminarMedioPago(Long id);
}

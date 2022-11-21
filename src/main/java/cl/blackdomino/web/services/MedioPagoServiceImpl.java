package cl.blackdomino.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.MedioPago;
import cl.blackdomino.web.repositories.MedioPagoRepository;

@Service
public class MedioPagoServiceImpl implements MedioPagoService{

	
	@Autowired
	private MedioPagoRepository medioPagoRepository;

	@Override
	public MedioPago guardarMedioPago(MedioPago medioPago) {
		
		
		//guardamos con el metodo save
		
				return medioPagoRepository.save(medioPago);
	}

	@Override
	public String eliminarMedioPago(Long id) {
		// verificamos primero si existe
				Boolean existe = medioPagoRepository.existsById(id);
				
				if(existe) {
					
					//lo eliminamos
					medioPagoRepository.deleteById(id);
					
				}else {
					
					return "Ese medio de pago no existe";
				}
				
				return "El medio de pago fue eliminado";
	}
}

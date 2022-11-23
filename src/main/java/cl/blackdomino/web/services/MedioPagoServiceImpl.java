package cl.blackdomino.web.services;

import java.util.List;

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

				existe = medioPagoRepository.existsById(id);

				if(existe){
					return "El medio de pago no fue eliminado";
				}
				
				return "El medio de pago fue eliminado";
	}

	@Override
	public String actualizarMedioPago(MedioPago medioPago) {
		Boolean existe = medioPagoRepository.existsById(medioPago.getId());
		if(existe){
			medioPagoRepository.save(medioPago);
			return "Medio de pago actualizado";
		}
		return "Medio de pago no actualizado";
	}

	@Override
	public MedioPago obtenerMedioPago(Long id) {
		MedioPago mensaje = medioPagoRepository.findById(id).get();
		return mensaje;
	}

	@Override
	public List<MedioPago> listaMedioPago() {
		
		return medioPagoRepository.findAll();
	}
}

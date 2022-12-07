package cl.blackdomino.web.services;

import java.util.List;
import cl.blackdomino.web.models.MedioPago;

public interface MedioPagoService {
	public MedioPago guardarMedioPago(MedioPago medioPago);
	public String eliminarMedioPago(Long id);
	public String actualizarMedioPago(MedioPago medioPago);
	public MedioPago obtenerMedioPago(Long id);
	public List<MedioPago> listaMedioPago();
}

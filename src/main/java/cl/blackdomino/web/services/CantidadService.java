package cl.blackdomino.web.services;

import java.util.List;

import cl.blackdomino.web.models.Cantidad;

public interface CantidadService {
	public Cantidad guardarCantidad(Cantidad cantidad);
	public String eliminarCantidad (Long id);
	public String actualizarCantidad(Cantidad cantidad);
	public Cantidad obtenerCantidad(Long id);
	public List<Cantidad> listaCantidad();
}

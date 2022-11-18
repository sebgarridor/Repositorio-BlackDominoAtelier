package cl.blackdomino.web.services;

import java.util.List;
import java.util.Optional;

import cl.blackdomino.web.models.Direccion;

public interface DireccionService {
	public Direccion guardarDireccion(Direccion direccion);
	public String eliminarDireccion(Long id);
	public String actualizarDireccion(Direccion direccion);
	public Optional<Direccion> obtenerDireccion(Long id);
	public List<Direccion> obtenerListaDireccion();

}

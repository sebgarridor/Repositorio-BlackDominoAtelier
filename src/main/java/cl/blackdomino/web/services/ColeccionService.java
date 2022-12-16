package cl.blackdomino.web.services;

import java.util.List;

import cl.blackdomino.web.models.Coleccion;

public interface ColeccionService {
	public Coleccion guardarColeccion(Coleccion coleccion);
	public String eliminarColeccion(Long id);
	public String actualizarColeccion(Coleccion coleccion);
	public Coleccion obtenerColeccion(Long id);
	public List<Coleccion> obtenerListaColeccion();	
}
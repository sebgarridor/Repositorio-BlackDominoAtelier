package cl.blackdomino.web.services;

import java.util.List;

import cl.blackdomino.web.models.Rol;

public interface RolService {
	public Rol guardarRol(Rol rol);
	public String eliminarRol(Long id);
	public String actualizarRol(Rol rol);
	public Rol obtenerRol(Long id);
	public List<Rol> obtenerListaRol();
}

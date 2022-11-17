package cl.blackdomino.web.services;

import java.util.List;

import cl.blackdomino.web.models.Administradores;

public interface AdministradorService {
	public Administradores guardarAdministrador(Administradores administrador);
	public String eliminarAdministrador(Long id);
	public String actualizarAdministador(Administradores administrador);
	public Administradores obtenerAdministrador(Long id);
	public List<Administradores> obtenerListaAdministradores();
}

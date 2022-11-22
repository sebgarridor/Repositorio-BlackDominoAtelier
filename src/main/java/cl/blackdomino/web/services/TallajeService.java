package cl.blackdomino.web.services;

import java.util.List;
import java.util.Optional;

import cl.blackdomino.web.models.Tallaje;

public interface TallajeService {
	public Tallaje guardarTallaje(Tallaje tallaje);
	public String eliminarTallaje(Long id);
	public String actualizarTallaje(Tallaje tallaje);
	public Tallaje obtenerTallaje(Long id);
	public List<Tallaje> obtenerListaTallaje();

}

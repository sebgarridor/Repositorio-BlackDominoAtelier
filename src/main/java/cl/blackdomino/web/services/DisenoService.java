package cl.blackdomino.web.services;

import java.util.List;
import java.util.Optional;

import cl.blackdomino.web.models.Diseno;

public interface DisenoService {
	
	public Diseno guardarDiseno(Diseno diseno);
	public String eliminarDiseno(Long id);
	public String actualizarDiseno(Diseno diseno);
	public Optional<Diseno> obtenerDiseno (Long id);
	public List<Diseno> obtenerListaDisenos();
}
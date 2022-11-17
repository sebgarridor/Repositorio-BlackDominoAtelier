package cl.blackdomino.web.services;

import java.util.List;
import java.util.Optional;

import cl.blackdomino.web.models.Disenos;

public interface DisenosService {
	
	public Disenos guardarDiseno(Disenos diseno);
	public String eliminarDiseno(Long id);
	public String actualizarDiseno(Disenos diseno);
	public Optional<Disenos> obtenerDiseno (Long id);
	public List<Disenos> obtenerListaDisenos();
}
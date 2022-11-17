package cl.blackdomino.web.services;

import cl.blackdomino.web.models.Dueno;

public interface DuenoService {
	
	public Dueno agregarDueno(Dueno dueno);
	
	public String actualizarDueno(Dueno dueno);
	
	public String eliminarDueno(Long id);
	
	public Dueno verDatos(Long id);

}

package cl.blackdomino.web.services;

import java.util.List;

import cl.blackdomino.web.models.Comuna;
import cl.blackdomino.web.models.Region;

public interface ComunaService {
	public Comuna guardarComuna(Comuna comuna);
	public Comuna obtenerComuna(Long id);
	public List<Comuna> obtenerComunas();
	public List<Comuna> findAllByRegion(Long id);

}

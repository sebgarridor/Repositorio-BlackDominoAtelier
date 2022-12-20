package cl.blackdomino.web.services;

import java.util.List;

import cl.blackdomino.web.models.Comuna;

public interface ComunaService {
	public Comuna guardarComuna(Comuna comuna);
	public Comuna obtenerComuna(Long id);
	public List<Comuna> obtenerComunas();

}

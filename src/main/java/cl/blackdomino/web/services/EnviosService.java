package cl.blackdomino.web.services;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Envios;

@Service
public interface EnviosService { //logica de negocios de la web

	//guardamos la data
	public Envios guardarEnvio(Envios envios);
	
	//eliminar la data
	public String eliminarEnvio(Long id);
	
	//actualizar la data
	public String actualizarEnvio(Envios envios);
	
	//obtener envio
	public Envios obtenerEnvio(Long id);
	
	//obtener todos los envios
	public List<Envios> listadoEnvios();
}

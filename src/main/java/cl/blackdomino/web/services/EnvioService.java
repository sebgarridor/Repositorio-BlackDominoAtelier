package cl.blackdomino.web.services;

import java.util.List;
import cl.blackdomino.web.models.Envio;

public interface EnvioService {
	public Envio guardarEnvio(Envio envio);
	public String eliminarEnvio(Long id);
	public String actualizarEnvio(Envio envio);
	public Envio obtenerEnvio(Long id);
	public List<Envio> listadoEnvios();
}

package cl.blackdomino.web.services;

import java.util.List;

import cl.blackdomino.web.models.Cliente;

public interface ClienteService {
	public Cliente guardarCliente(Cliente cliente);
	public String eliminarCliente(Long id);
	public Cliente obtenerCliente(Long id);
	public List<Cliente> obtenerListaCliente();
}

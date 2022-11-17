package cl.blackdomino.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Cliente;
import cl.blackdomino.web.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente guardarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteRepository.save(cliente);
	}
	
	

}

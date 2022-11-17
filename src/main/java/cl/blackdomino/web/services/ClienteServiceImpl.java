package cl.blackdomino.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Cliente;
import cl.blackdomino.web.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente guardarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteRepository.save(cliente);
	}

	@Override
	public String eliminarCliente(Long id) {
		Boolean existe = clienteRepository.existsById(id);

		if (existe) {
			clienteRepository.deleteById(id);
		} else {
			return "Usuario no existe en la tabla";
		}
		existe = clienteRepository.existsById(id);
		// Optional<Usuario> usuario = usuarioRepositry.findById(id);
		if (existe) {
			return "Usuario no eliminado";
		}
		return "El usuario fue eliminado";
	}

	@Override
	public Cliente obtenerCliente(Long id) {
		// TODO Auto-generated method stub\
		Boolean existe = clienteRepository.existsById(id);
		
		if(existe) {
		Cliente client= clienteRepository.findById(id).get();
			return client;
		}
		return null;
	}

	@Override
	public List<Cliente> obtenerListaCliente() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

}

package cl.blackdomino.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.blackdomino.web.models.Cliente;
import cl.blackdomino.web.services.ClienteServiceImpl;

@RestController
public class ClienteApiRestController {
	@Autowired
	private ClienteServiceImpl clienteServiceImpl;
	
	@RequestMapping ("/guardar/uCliente")
	public Cliente guardarCliente (@RequestBody Cliente cliente) {
		// http://localhost:8080/guardar/Cliente
		
				/* empresa: true
				 * rut: "21965978-5"
				 */
		return clienteServiceImpl.guardarCliente(cliente);
	}
}

package cl.blackdomino.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.blackdomino.web.models.Cliente;
import cl.blackdomino.web.services.ClienteServiceImpl;

@RestController
public class ClienteApiRestController {
	@Autowired
	private ClienteServiceImpl clienteServiceImpl;
	
	@RequestMapping ("/guardar/Cliente")
	public Cliente guardarCliente (@RequestBody Cliente cliente) {
		// http://localhost:8080/guardar/Cliente
		
				/* empresa: true
				 * rut: "21965978-5"
				 */
		return clienteServiceImpl.guardarCliente(cliente);
	}
	
	@RequestMapping("/eliminar/cliente")
	public String eliminarCliente(@RequestParam(value="id",required = false) Long id) {
		return clienteServiceImpl.eliminarCliente(id);
	}
	
	@RequestMapping("/obtener/cliente")
	public Cliente obtenerCliente(@RequestParam(value="id",required = true) Long id) {
		return clienteServiceImpl.obtenerCliente(id);
	}
	
	//listar todos los usuarios
		@GetMapping("/listar/clientes")
		public List<Cliente> obtenerListaCliente(){
			return clienteServiceImpl.obtenerListaCliente();
		}
}

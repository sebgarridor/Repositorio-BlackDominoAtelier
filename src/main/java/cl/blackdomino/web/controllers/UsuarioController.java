package cl.blackdomino.web.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@RequestMapping("/administradores")
	public String administradores() {
		System.out.println("en el metodo de administradores");
		return "administradores";
	}

	@RequestMapping("/duenos")
	public String duenos() {
		System.out.println("en el metodo de duenos");
		return "duenos";
	}
	
	@RequestMapping("/clientes")
	public String clientes() {
		System.out.println("en el metodo de clientes");
		return "clientes";
	}
	
}

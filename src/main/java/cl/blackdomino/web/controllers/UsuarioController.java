package cl.blackdomino.web.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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

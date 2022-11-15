package cl.blackdomino.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductosControllers {
	@RequestMapping("/productos")
	public String productos() {
		System.out.println("en el método productos");
		return "productos";
	}
}


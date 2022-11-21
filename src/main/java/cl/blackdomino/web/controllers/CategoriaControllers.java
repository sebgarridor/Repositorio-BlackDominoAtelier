package cl.blackdomino.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoriaControllers {
	@RequestMapping("/categorias")   
	public String categorias() {
		System.out.println("en el método categorias");
		return "categorias";
	}
	
	@RequestMapping("/categorias/totebag")   
	public String totebag() {
		System.out.println("en el método totebag");
		return "totebag";
	}
	
	@RequestMapping("/categorias/poleras")   
	public String poleras() {
		System.out.println("en el método poleras");
		return "poleras";
	}
	
	@RequestMapping("/categorias/bandoleras")   
	public String bandoleras() {
		System.out.println("en el método bandoleras");
		return "bandoleras";
	}
}


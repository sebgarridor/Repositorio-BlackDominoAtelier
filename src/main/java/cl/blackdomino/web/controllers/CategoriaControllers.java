package cl.blackdomino.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categorias")
public class CategoriaControllers {
	
	@RequestMapping("")   
	public String categorias() {
		System.out.println("en el método categorias");
		return "categorias";
	}
	
	@RequestMapping("/totebag")   
	public String totebag() {
		System.out.println("en el método totebag");
		return "totebag";
	}
	
	@RequestMapping("poleras")   
	public String poleras() {
		System.out.println("en el método poleras");
		return "poleras";
	}
	
	@RequestMapping("bandoleras")   
	public String bandoleras() {
		System.out.println("en el método bandoleras");
		return "bandoleras";
	}
}


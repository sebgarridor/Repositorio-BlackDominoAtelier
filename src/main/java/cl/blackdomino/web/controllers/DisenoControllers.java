package cl.blackdomino.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisenoControllers {
	@RequestMapping("/disenos")
	public String disenos() {
		System.out.println("en el método diseños");
		return "disenos";
	}
}

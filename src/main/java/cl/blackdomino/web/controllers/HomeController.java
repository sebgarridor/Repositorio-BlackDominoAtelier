package cl.blackdomino.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {
	// http://localhost:8080/home
	
		@GetMapping("/home")
		public String mostrarHome() {
			return "home.jsp";
		}
		
		@GetMapping("/preguntasfrecuentes")
		public String mostrarPreguntas() {
			return "preguntasfrecuentes.jsp";
		}
		
		@GetMapping("/comocomprar")
		public String mostrarComocomprar() {
			return "comocomprar.jsp";
		}
}

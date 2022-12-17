package cl.blackdomino.web.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.blackdomino.web.models.Usuario;
import cl.blackdomino.web.services.UsuarioServiceImpl;

@Controller
@RequestMapping("/admin")
public class RegistroController {
	
	//traemos la clase a la que vamos a inyectarle información
	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;
	
	
	
	//REGISTRO
	
	//primero desplegamos (mostramos) el formulario
	@GetMapping("/registro")
	public String mostrarFormulario() {
		return "registro.jsp";
	}
	
	//capturamos la info en parámetros  y post
	@PostMapping("/registro")
	public String guardarFormulario(@RequestParam("nombre") String nombre,
			@RequestParam("apellido") String apellido,
			@RequestParam("correo") String correo,
			@RequestParam("password") String password,
			@RequestParam("password2") String password2,
			@RequestParam("telefono") String telefono,
			Model model) {
		
		//al devolver una vista usamos string para la función
		//el model aparece algo en la pantalla???
		
		//antes de guardar los datos primero tenemos que asegurarnos que 
		//las contraseñas sean inguales
		if(password.equals(password2)) {//password iguales
			
			
				
			
			//como es verdadero creamos la instancia para despues guardarla
			Usuario usuario = new Usuario();
			//guardamos los atributos
			usuario.setNombre(nombre);
			usuario.setApellido(apellido);
			usuario.setCorreo(correo);
			usuario.setPassword(password);
			usuario.setTelefono(telefono);
			
			//enviamos a base de datos
			//verificamos antes que no haya un correo igual registrado
			Boolean resultado = usuarioServiceImpl.guardarUsuario(usuario);
			
			//si es verdadero, registro exitoso
			if(resultado) {
				
				// mostramos mensaje de exito
				model.addAttribute("msgOk", "Registro exitoso");
				
				//lo enviamos a la vista para logearse
				//por mientras colocamos archivo, despues redirect a url
				return "redirect:/admin/login";
			}else {
				model.addAttribute("msgError", "Email ya registrado");
				return "registro.jsp";
			}
		
		}else {//password distintos
			model.addAttribute("msgError", "Verifique password");
			return "registro.jsp";
		}
		
	}
	
	
	
	//FIN REGISTRO
	
	
	//INICIAR SESIÓN
	
	//desplegamos jsp
	@GetMapping("/login")
	public String loginFormulario(){
		return "login.jsp";
	}
	
	//capturamos el correo y el password
	@PostMapping("/login")
	public String ingresoUsuario(@RequestParam("correo") String correo,
			@RequestParam("password") String password,
			Model model,
			HttpSession session) {
		//HttpSession: guarda la información del usuario en la base de datos local
		//por un determinado tiempo
		
		//llamamos al método, verifica si tenemos al usuario en el sistema
		Boolean resultadoLogin = usuarioServiceImpl.ingresoUsuario(correo, password);
		
		if(resultadoLogin) {//si es verdadero login correcto
			
			//lo llamamos (o buscamos) con el correo
			Usuario usuario = usuarioServiceImpl.obtenerCorreoUsuario(correo);
			
			//guardamos info en session
			session.setAttribute("usuarioId", usuario.getId());
			session.setAttribute("usuarioCorreo", correo);
			//ya lo llamamos antes, así que no colocamos usuario.getCorreo()
			session.setAttribute("usuarioNombre", usuario.getNombre());
			session.setAttribute("usuarioApellido", usuario.getApellido());
			
			
			//redirigimos a una ruta interna
			return "redirect:/home";
			
		}else {//si es incorrecto el login
			model.addAttribute("msgError","Por favor verifica tus datos ingresados" );
			return "login.jsp";
			
		}
		
	}
	

}

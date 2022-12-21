package cl.blackdomino.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import cl.blackdomino.web.models.Comuna;
import cl.blackdomino.web.models.Direccion;
import cl.blackdomino.web.models.Region;
import cl.blackdomino.web.models.Usuario;
import cl.blackdomino.web.services.ComunaServiceImpl;
import cl.blackdomino.web.services.DireccionServiceImpl;
import cl.blackdomino.web.services.ProductoServiceImpl;
import cl.blackdomino.web.services.RegionServiceImpl;
import cl.blackdomino.web.services.UsuarioServiceImpl;

@Controller
@RequestMapping("")
public class VentaController {
	@Autowired
	ProductoServiceImpl productoServiceImpl;

	@Autowired
	ComunaServiceImpl comunaServiceImpl;

	@Autowired
	RegionServiceImpl regionServiceImpl;
	
	@Autowired
	DireccionServiceImpl direccionServiceImpl;
	
	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;

	@GetMapping("")
	public String compraProducto() {
		return "compra.jsp";
	}

	// integrar anchor carro compras

	@GetMapping("/productoscarrito")
	public String mostrarCarrito() {
		return "productoscarrito.jsp";
	}

	@PostMapping("/carrito")
	public String guardarCarrito(@RequestParam("cantidad") String cantidad) {
		return null;
	}

	@GetMapping("/checkout")
	public String mostrarChekout(Model model) {
		// lista para el selector
		List<Region> listaSelRegion = regionServiceImpl.obtenerRegiones();
		model.addAttribute("listaSelRegion", listaSelRegion);
		List<Comuna> listaSelComuna = comunaServiceImpl.obtenerComunas();
		model.addAttribute("listaSelComuna", listaSelComuna);
		
		model.addAttribute("listaSelComuna", listaSelComuna);
		model.addAttribute("listaSelRegion", listaSelRegion);
		
		return "checkout.jsp";
	}

	@PostMapping("/checkout")
	public String checkout(@RequestParam("rut") String rut, 
			@RequestParam("correo") String correo,
			@RequestParam("telefono") Integer telefono, 
			@RequestParam("nombre") String nombre,
			@RequestParam("apellido") String apellido,
			@RequestParam("ciudad") String ciudad,
			@RequestParam("region") Long id_region,
			@RequestParam("comuna") Long id_comuna,
			Model model) {
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setApellidos(apellido);
		usuario.setCorreo(correo);
		usuario.setTelefono(telefono);
		usuario.setRut(rut);
		usuarioServiceImpl.guardarUsuario(usuario);
		
		Comuna comuna = comunaServiceImpl.obtenerComuna(id_comuna);
		Direccion direccion = new Direccion();
		direccion.setCiudad(ciudad);
		direccion.setComuna(comuna);
		direccionServiceImpl.guardarDireccion(direccion);	
			return "checkout.jsp";
		 }

	@GetMapping("/descripcionproducto")
	public String mostrarDescProd() {
		return "descripcionproducto.jsp";
	}

	@GetMapping("/exitotarjeta")
	public String mostrarExito() {
		return "exitotarjeta.jsp";
	}

	@GetMapping("/exitotransferencia")
	public String mostrarExitoTrans() {
		return "exitotransferencia.jsp";
	}

	@GetMapping("/revisionpedido")
	public String mostrarRevision() {
		return "revisionpedido.jsp";
	}

}

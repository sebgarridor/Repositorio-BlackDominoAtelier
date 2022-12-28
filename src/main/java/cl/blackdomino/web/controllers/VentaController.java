package cl.blackdomino.web.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.blackdomino.web.models.Categoria;
import cl.blackdomino.web.models.Comuna;
import cl.blackdomino.web.models.Direccion;
import cl.blackdomino.web.models.Envio;
import cl.blackdomino.web.models.MedioPago;
import cl.blackdomino.web.models.Region;
import cl.blackdomino.web.models.Tallaje;
import cl.blackdomino.web.models.Usuario;
import cl.blackdomino.web.models.Venta;
import cl.blackdomino.web.services.CategoriaServiceImpl;
import cl.blackdomino.web.services.ComunaServiceImpl;
import cl.blackdomino.web.services.DireccionServiceImpl;
import cl.blackdomino.web.services.EnvioServiceImpl;
import cl.blackdomino.web.services.MedioPagoServiceImpl;
import cl.blackdomino.web.services.ProductoServiceImpl;
import cl.blackdomino.web.services.RegionServiceImpl;
import cl.blackdomino.web.services.TallajeServiceImpl;
import cl.blackdomino.web.services.UsuarioServiceImpl;
import cl.blackdomino.web.services.VentaServiceImpl;

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
	
	@Autowired
	TallajeServiceImpl tallajeServiceImpl;
	
	@Autowired
	CategoriaServiceImpl categoriaServiceImpl;
	
	@Autowired
	MedioPagoServiceImpl medioPagoServiceImpl;
	
	@Autowired
	EnvioServiceImpl envioServiceImpl;
	
	@Autowired
	VentaServiceImpl ventaServiceImpl;
	

	
	@GetMapping("/descripcionproducto")
	public String mostrarDescProd(Model model) {
		List<Tallaje> listaSelTallaje = tallajeServiceImpl.obtenerListaTallaje();
		List<Categoria> listaSelCategoria = categoriaServiceImpl.obtenerListaCategorias();

		
		model.addAttribute("listaSelTallaje", listaSelTallaje);
		model.addAttribute("listaSelCategoria", listaSelCategoria);
		return "descripcionproducto.jsp";
	}
	
	@PostMapping("/descripcionproducto")
	public String capturarProductos(@RequestParam("tallaje") Long id_tallaje,
			@RequestParam("cantidad") Long id_cantidad,
			@RequestParam("categoria") Long id_categoria,
			Model model){
		return "redirect:/productoscarrito";
		
	}
	
	@GetMapping("/productoscarrito")
	public String mostrarCarrito(Model model, Long id) {
		List<Region> listaSelRegion = regionServiceImpl.obtenerRegiones();
		List<Comuna> listaSelComuna = comunaServiceImpl.findAllByRegion(id);
		
		model.addAttribute("listaSelRegion", listaSelRegion);
		model.addAttribute("listaSelComuna", listaSelComuna);
		
		//Integer precioFinal = cantidad*precio
		return "productoscarrito.jsp";
	}
	
	@PostMapping("/productoscarrito")
	public String guardarCarrito() {
		return "productoscarrito.jsp";
	} 

	
	@GetMapping("/checkout")
	public String mostrarChekout(Model model, Long id) {
		// lista para el selector
		List<Region> listaSelRegion = regionServiceImpl.obtenerRegiones();
		List<Comuna> listaSelComuna = comunaServiceImpl.findAllByRegion(id);
		List<Envio> envio = envioServiceImpl.listadoEnvios();
		List<MedioPago> pago = medioPagoServiceImpl.listaMedioPago();
		
		model.addAttribute("listaSelRegion", listaSelRegion);
		model.addAttribute("listaSelComuna", listaSelComuna);
		model.addAttribute("envio", envio);
		model.addAttribute("pago", pago);
		return "checkout.jsp";
	}

	@PostMapping("/checkout")
	public String checkout(@RequestParam(value="rut", required=true) String rut, 
			@RequestParam(value="correo", required=true) String correo,
			@RequestParam(value="telefono", required=true) String telefono, 
			@RequestParam(value="nombre", required=true) String nombre,
			@RequestParam(value="calle", required=true) String calle,
			@RequestParam(value="apellidos", required=true) String apellidos,
			@RequestParam(value="ciudad", required=true) String ciudad,
			@RequestParam(value="region", required=true) Long id_region,
			@RequestParam(value="comuna", required=true) Long id_comuna,
			@RequestParam(value="instrucciones", required=true) String instrucciones,
			@RequestParam(value="mediopago", required=true) Long id_mediopago,
			@RequestParam(value="envio", required=true) Long id_envio,
			Model model) {

		Comuna comuna = comunaServiceImpl.obtenerComuna(id_comuna);
		Direccion direccion = new Direccion();
		direccion.setCalle(calle);
		direccion.setCiudad(ciudad);
		direccion.setInstrucciones(instrucciones);
		direccion.setComuna(comuna);
		direccionServiceImpl.guardarDireccion(direccion);
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setApellidos(apellidos);
		usuario.setCorreo(correo);
		usuario.setTelefono(telefono);
		usuario.setRut(rut);
		usuario.setDireccion(direccion);
		usuarioServiceImpl.guardarUsuario(usuario);
		
		MedioPago medioPago = medioPagoServiceImpl.obtenerMedioPago(id_mediopago);
		Envio envio = envioServiceImpl.obtenerEnvio(id_envio);
		Venta venta = new Venta();
		venta.setUsuario(usuario);
		venta.setMediopago(medioPago);
		venta.setEnvio(envio);
		ventaServiceImpl.guardarVenta(venta);
		
		return "redirect:/revisionpedido";
		 }

	@GetMapping("/revisionpedido")
	public String mostrarRevision() {
		//mostrar venta
		//mostrar los datos del usuario y el precio total de la compra más envío
		return "revisionpedido.jsp";
	}
	
	@PostMapping("/revisionpedido")
	public String guardarRevision() {
		//guardar en la base de datos
		//redirección a método de pago
		return "revisionpedido.jsp";
	}

	@GetMapping("/exitotarjeta")
	public String mostrarExito() {
		return "exitotarjeta.jsp";
	}

	@GetMapping("/exitotransferencia")
	public String mostrarExitoTrans() {
		return "exitotransferencia.jsp";
	}

	

}

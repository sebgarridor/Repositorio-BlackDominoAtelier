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
import cl.blackdomino.web.models.Producto;
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

	@GetMapping("")
	public String compraProducto() {
		return "compra.jsp";
	}

	// integrar anchor carro compras

	
	@GetMapping("/checkout")
	public String mostrarChekout(Model model, Long id) {
		// lista para el selector
		List<Region> listaSelRegion = regionServiceImpl.obtenerRegiones();
		List<Comuna> listaSelComuna = comunaServiceImpl.findAllByRegion(id);
		
		model.addAttribute("listaSelRegion", listaSelRegion);
		model.addAttribute("listaSelComuna", listaSelComuna);	
		return "checkout.jsp";
	}

	@PostMapping("/checkout")
	public String checkout(@RequestParam("rut") String rut, 
			@RequestParam("correo") String correo,
			@RequestParam("telefono") String telefono, 
			@RequestParam("nombre") String nombre,
			@RequestParam("calle") String calle,
			@RequestParam("apellidos") String apellidos,
			@RequestParam("ciudad") String ciudad,
			@RequestParam("region") Long id_region,
			@RequestParam("comuna") Long id_comuna,
			@RequestParam("instrucciones") String instrucciones,
			@RequestParam("mediopago") Long id_mediopago,
			@RequestParam("envio") Long id_envio,
			Model model) {
		
		if(rut.equals(null) || correo.equals(null) || telefono.equals(null) || nombre.equals(null) ||
				apellidos.equals(null) || ciudad.equals(null)|| calle.equals(null)|| id_region == 0 || id_comuna == 0 )
		{
			model.addAttribute("msgError","llene todos los campos");
			
			return "checkout.jsp";
		}
		
		
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
		
		MedioPago medioPago = medioPagoServiceImpl.obtenerMedioPago(id_envio);
		Envio envio = envioServiceImpl.obtenerEnvio(id_envio);
		Venta venta = new Venta();
		venta.setUsuario(usuario);
		venta.setMediopago(medioPago);
		venta.setEnvio(envio);
		ventaServiceImpl.guardarVenta(venta);
		
		return "revisionpedido.jsp";
		 }

	@GetMapping("/descripcionproducto")
	public String mostrarDescProd(Model model) {
		List<Tallaje> listaSelTallaje = tallajeServiceImpl.obtenerListaTallaje();
		model.addAttribute("listaSelTallaje", listaSelTallaje);
		List<Categoria> listaSelCategoria = categoriaServiceImpl.obtenerListaCategorias();
		model.addAttribute("listaSelCategoria", listaSelCategoria);
		return "descripcionproducto.jsp";
	}
	
	@PostMapping("/descripcionproducto")
	public String capturarProductos(@RequestParam("tallaje") Long id_tallaje,
			@RequestParam("categoria") Long id_categoria,
			@RequestParam("cantidad") Integer cantidad,
			Model model){
		
		Categoria categoria = categoriaServiceImpl.obtenerCategoria(id_categoria);
		Tallaje tallaje = tallajeServiceImpl.obtenerTallaje(id_tallaje);
		Producto producto = new Producto();
		producto.setCategoria(categoria);
		producto.setTallaje(tallaje);
		producto.setCantidad(cantidad);
		return "descripcionproducto.jsp";
		
	}
	
	@PostMapping("/productoscarrito")
	public String mostrarCarrito() {
		return "productoscarrito.jsp";
	}

	@GetMapping("/exitotarjeta")
	public String mostrarExito() {
		return "exitotarjeta.jsp";
	}

	@GetMapping("/exitotransferencia")
	public String mostrarExitoTrans() {
		return "exitotransferencia.jsp";
	}

	@PostMapping("/revisionpedido")
	public String mostrarRevision() {
		return "revisionpedido.jsp";
	}

}

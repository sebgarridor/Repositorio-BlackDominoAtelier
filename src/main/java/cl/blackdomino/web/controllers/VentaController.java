	package cl.blackdomino.web.controllers;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import cl.blackdomino.web.models.Categoria;
	import cl.blackdomino.web.models.Producto;
	import cl.blackdomino.web.models.Tallaje;
	import cl.blackdomino.web.services.ProductoServiceImpl;
	
	@Controller
	@RequestMapping("")
	public class VentaController {
	@Autowired
	ProductoServiceImpl productoServiceImpl;

	@GetMapping("")
	public String compraProducto() {
		return "compra.jsp";
	}

		
    //integrar anchor carro compras
	

	@GetMapping("/productoscarrito")
	public String mostrarCarrito() {
		return "productoscarrito.jsp";
	}

	@PostMapping("/carrito")
	public String guardarCarrito(@RequestParam("cantidad") String cantidad) {
		return null;
	}

	@GetMapping("/checkout")
	public String mostrarChekout() {
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

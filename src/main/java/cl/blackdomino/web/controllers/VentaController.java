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
@RequestMapping("/compra")
public class VentaController {
	@Autowired
	ProductoServiceImpl productoServiceImpl;

	@GetMapping("")
	public String compraProducto() {
		return "compra.jsp";
	}

	@PostMapping("")
	public String guardarProducto(@RequestParam("categoria") Categoria categoria,
			@RequestParam("tallaje") Tallaje tallaje, 
			@RequestParam("cantidad") Integer cantidad,
			Model model) {
		if (categoria != null && tallaje != null && cantidad != null) {
			Producto producto = new Producto();
			producto.setCategoria(categoria);
			producto.setTallaje(tallaje);
			producto.setCantidad(cantidad);
			model.addAttribute("msgOk", "Producto añadido al carrito");
		}
		return "compra.jsp";
    //integrar anchor carro compras
	}

	@GetMapping("/carrito")
	public String mostrarCarrito() {
		return "carrito.jsp";
	}

	@PostMapping("/carrito")
	public String guardarCarrito(@RequestParam("cantidad") String cantidad) {
		return null;
	}

	@GetMapping("/checkout")
	public String mostrarChekout(@RequestParam("correo")String correo,
			@RequestParam("telefono")String telefono,
			@RequestParam("rut")String rut,
			@RequestParam("nombre")String nombre,
			@RequestParam("apellido")String apellido,
			@RequestParam("direccion")String direccion,
			@RequestParam("ciudad")String ciudad,
			@RequestParam("region")String region,
			@RequestParam("comuna")String comuna) {
		return "checkout.jsp";
	}

}

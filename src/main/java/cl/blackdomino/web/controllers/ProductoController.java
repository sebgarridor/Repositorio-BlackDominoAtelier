package cl.blackdomino.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import cl.blackdomino.web.models.Producto;
import cl.blackdomino.web.services.CategoriaServiceImpl;
import cl.blackdomino.web.services.DisenoServiceImpl;
import cl.blackdomino.web.services.ProductoServiceImpl;


@Controller
@RequestMapping("")
public class ProductoController {
	@Autowired
	ProductoServiceImpl productoServiceImpl;
	@Autowired
	CategoriaServiceImpl categoriaServiceImpl;
	@Autowired
	DisenoServiceImpl disenoServiceImpl;
	
	
	// http://localhost:8080/producto
		@GetMapping("/producto")
		public String mostrarProductos (Model model) {
			List<Producto> listaProductos = productoServiceImpl.obtenerListaProductos();
			model.addAttribute("productos", listaProductos);
			
			//lista selector
			List<Producto> listaSelectProductos = productoServiceImpl.obtenerListaProductos();
			model.addAttribute("listaSelectProductos", listaSelectProductos);
			return "producto.jsp";
		}

		@PostMapping("")
		public String filtarProductos(@RequestParam("productoSeleccionado")Long id, Model model) {
			List<Producto> listaProductos = new ArrayList<Producto>();
			Producto producto = productoServiceImpl.obtenerProducto(id);
			listaProductos.add(producto);
			model.addAttribute("productos", listaProductos);
			
			//lista selector
			List<Producto> listaSelectProductos = productoServiceImpl.obtenerListaProductos();
			model.addAttribute("listaSelectProductos", listaSelectProductos);
			
			return "producto.jsp";
		}
	// http://localhost:8080/poleras
	@GetMapping("/poleras")
	public String mostrarPoleras() {
		return "poleras.jsp";
	}

	// http://localhost:8080/polerones/hoodie
	@GetMapping("/polerones/hoodie")
	public String mostrarPoleronesHoodie() {
		return "polerones_hoodie.jsp";
	}
	
	// http://localhost:8080/polerones/polo
		@GetMapping("/polerones/polo")
		public String mostrarPoleronesPolo() {
			return "polerones_polo.jsp";
		}

	// http://localhost:8080/totebag
	@GetMapping("/totebag")
	public String mostrarTotes() {
		return "totebag.jsp";
	}

	// http://localhost:8080/bandoleras
	@GetMapping("/bandoleras")
	public String mostrarBandoleras() {
		return "bandoleras.jsp";
	}

	@GetMapping("/tallaje")
	// http://localhost:8080/tallaje
	public String mostrartallas() {
		return "tallaje.jsp";
	}
	//Colecciones comienzo
	
	@GetMapping("/colecciones")
	// http://localhost:8080/colecciones
	public String mostrarColecciones() {
		return "colecciones.jsp";
	}
	
	@GetMapping("/colecciones_akira")
	// http://localhost:8080/colecciones_akira
	public String mostrarColeccionAkira() {
		return "colecciones_akira.jsp";
	}
	
	@GetMapping("/colecciones_berserk")
	// http://localhost:8080/colecciones_berserk
	public String mostrarColeccionBerserk() {
		return "colecciones_berserk.jsp";
	}
	
	@GetMapping("/colecciones_bleach")
	// http://localhost:8080/colecciones_bleach
	public String mostrarColeccionBleach() {
		return "colecciones_bleach.jsp";
	}
	
	@GetMapping("/colecciones_bungo")
	// http://localhost:8080/colecciones_bungo
	public String mostrarColeccionBungo() {
		return "colecciones_bungo.jsp";
	}
	
	@GetMapping("/colecciones_chainsawman")
	// http://localhost:8080/colecciones_chainsawman
	public String mostrarColeccionChainsaw() {
		return "colecciones_chainsawman.jsp";
	}
	
	@GetMapping("/colecciones_dedede")
	// http://localhost:8080/colecciones_dedede
	public String mostrarColeccionDedede() {
		return "colecciones_dedede.jsp";
	}
	
	@GetMapping("/colecciones_dragonballz")
	// http://localhost:8080/colecciones_dedede
	public String mostrarColeccionDragon() {
		return "colecciones_dedede.jsp";
	}
}

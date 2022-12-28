package cl.blackdomino.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cl.blackdomino.web.models.Categoria;
import cl.blackdomino.web.models.Coleccion;
import cl.blackdomino.web.models.Diseno;
import cl.blackdomino.web.models.Producto;
import cl.blackdomino.web.models.Tallaje;
import cl.blackdomino.web.services.CategoriaServiceImpl;
import cl.blackdomino.web.services.ColeccionServiceImpl;
import cl.blackdomino.web.services.DisenoServiceImpl;
import cl.blackdomino.web.services.ProductoServiceImpl;
import cl.blackdomino.web.services.TallajeServiceImpl;


@Controller
@RequestMapping("")
public class ProductoController {
	@Autowired
	ProductoServiceImpl productoServiceImpl;
	@Autowired
	CategoriaServiceImpl categoriaServiceImpl;
	@Autowired
	DisenoServiceImpl disenoServiceImpl;
	@Autowired
	TallajeServiceImpl tallajeServiceImpl;
	@Autowired
	ColeccionServiceImpl coleccionServiceImpl;
	
	
	@GetMapping("/formulario/producto")
	public String formularioProducto (Model model) {
		
		return "producto.jsp";
	}
	
	@PostMapping("/formulario/producto")
	public String guardarProducto(@RequestParam("precio")Integer precio,
			@RequestParam("producto")String producto,
			@RequestParam("categoria") Long id_categoria,
			@RequestParam("diseño") Long id_diseno,
			@RequestParam("talla") Long id_tallaje,
			@RequestParam("coleccion") Long id_coleccion,
			final @RequestParam("foto") MultipartFile foto,
			Model model
			) throws IOException {
		Categoria categoria = categoriaServiceImpl.obtenerCategoria(id_categoria);
		Diseno diseno = disenoServiceImpl.obtenerDiseno(id_diseno);
		Tallaje tallaje = tallajeServiceImpl.obtenerTallaje(id_tallaje);
		Coleccion coleccion = coleccionServiceImpl.obtenerColeccion(id_coleccion);
		byte[] imagenProducto = foto.getBytes();
		Producto productoNuevo = new Producto();
		productoNuevo.setCategoria(categoria);
		productoNuevo.setColeccion(coleccion);
		productoNuevo.setDiseno(diseno);
		productoNuevo.setFoto(imagenProducto);
		productoNuevo.setProducto(producto);
		productoNuevo.setPrecio(precio);
		productoNuevo.setTallaje(tallaje);
		
		Boolean resultado = productoServiceImpl.guardarProducto(productoNuevo);
		if(resultado) {
			model.addAttribute("msgOk", "Producto registrado con éxito");
			}
				model.addAttribute("msgError", "Producto en existencia");
				return "producto";			
	}
	
	
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

		@PostMapping("/producto")
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
	
	@GetMapping("/colecciones/akira")
	// http://localhost:8080/colecciones_akira
	public String mostrarColeccionAkira() {
		return "colecciones_akira.jsp";
	}
	
	@GetMapping("/colecciones/berserk")
	// http://localhost:8080/colecciones_berserk
	public String mostrarColeccionBerserk() {
		return "colecciones_berserk.jsp";
	}
	
	@GetMapping("/colecciones/bleach")
	// http://localhost:8080/colecciones_bleach
	public String mostrarColeccionBleach() {
		return "colecciones_bleach.jsp";
	}
	
	@GetMapping("/colecciones/bungo")
	// http://localhost:8080/colecciones/bungo
	public String mostrarColeccionBungo() {
		return "colecciones_bungo.jsp";
	}
	
	@GetMapping("/colecciones/chainsawman")
	// http://localhost:8080/colecciones/chainsawman
	public String mostrarColeccionChainsaw() {
		return "colecciones_chainsawman.jsp";
	}
	
	@GetMapping("/colecciones/dedede")
	// http://localhost:8080/colecciones/dedede
	public String mostrarColeccionDedede() {
		return "colecciones_dedede.jsp";
	}
	
	@GetMapping("/colecciones/dragonballz")
	// http://localhost:8080/colecciones/dedede
	public String mostrarColeccionDragon() {
		return "colecciones_dedede.jsp";
	}
	
	@GetMapping("/colecciones/evangelion")
	// http://localhost:8080/colecciones/evangelion
	public String mostrarColeccionEvangelion() {
		return "colecciones_evangelion.jsp";
	}
	
	@GetMapping("/colecciones/fireforce")
	// http://localhost:8080/colecciones/fireforce
	public String mostrarColeccionfireforce() {
		return "colecciones_fireforce.jsp";
	}
	
	@GetMapping("/colecciones/fma")
	// http://localhost:8080/colecciones/fma
	public String mostrarColeccionfma() {
		return "colecciones_fma.jsp";
	}
	
	@GetMapping("/colecciones/hxh")
	// http://localhost:8080/colecciones/hxh
	public String mostrarColeccionhxh() {
		return "colecciones_hxh.jsp";
	}
	
	@GetMapping("/colecciones/jujutsukaizen")
	// http://localhost:8080/colecciones/jujutsukaizen
	public String mostrarColeccionJujutsukaizen() {
		return "colecciones_jujustsukaizen.jsp";
	}
	
	@GetMapping("/colecciones/junbjiito")
	// http://localhost:8080/colecciones/jujutsukaizen
	public String mostrarColeccionJunjiito() {
		return "colecciones_junjiito.jsp";
	}
	
	@GetMapping("/colecciones/kimetsu")
	// http://localhost:8080/colecciones/kimestu
	public String mostrarColeccionKimetsu() {
		return "colecciones_kimetsu.jsp";
	}
	
	@GetMapping("/colecciones/mieruko")
	// http://localhost:8080/colecciones/jujutsukaizen
	public String mostrarColeccionMieruko() {
		return "colecciones_mieruko.jsp";
	}
	
	@GetMapping("/colecciones/mobpsycho")
	// http://localhost:8080/colecciones/jujutsukaizen
	public String mostrarColeccionMobpsycho() {
		return "colecciones_mobpsycho.jsp";
	}
	
	@GetMapping("/colecciones/mydressupdarling")
	// http://localhost:8080/colecciones/mydressupdarling
	public String mostrarColeccionMydressupdarling() {
		return "colecciones_mydressupdarling.jsp";
	}
	
	@GetMapping("/colecciones/naruto")
	// http://localhost:8080/colecciones/naruto
	public String mostrarColeccionNaruto() {
		return "colecciones_naruto.jsp";
	}
	
	@GetMapping("/colecciones/oyasumipunpun")
	// http://localhost:8080/colecciones/oyasumipunpun
	public String mostrarColeccionpunpun() {
		return "colecciones_punpun.jsp";
	}
	
	@GetMapping("/colecciones/sakura")
	// http://localhost:8080/colecciones/sakura
	public String mostrarColeccionSakura() {
		return "colecciones_sakura.jsp";
	}
	
	@GetMapping("/colecciones/shingeki")
	// http://localhost:8080/colecciones/shingeki
	public String mostrarColeccionShingeki() {
		return "colecciones_shingeki.jsp";
	}
	
	@GetMapping("/colecciones/souleater")
	// http://localhost:8080/colecciones/souleater
	public String mostrarColeccionSouleater() {
		return "colecciones_souleater.jsp";
	}
	
	@GetMapping("/colecciones/tokyoghoul")
	// http://localhost:8080/colecciones/tokyoghoul
	public String mostrarColeccionTokyoghoul() {
		return "colecciones_tokyoghoul.jsp";
	}
	
}

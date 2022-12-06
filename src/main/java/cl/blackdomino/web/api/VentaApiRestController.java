package cl.blackdomino.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.blackdomino.web.models.Venta;
import cl.blackdomino.web.models.DTE;
import cl.blackdomino.web.models.Estado;
import cl.blackdomino.web.models.MedioPago;
import cl.blackdomino.web.models.Usuario;
import cl.blackdomino.web.services.DTEServiceImpl;
import cl.blackdomino.web.services.EstadoServiceImpl;
import cl.blackdomino.web.services.MedioPagoServiceImpl;
import cl.blackdomino.web.services.UsuarioServiceImpl;
import cl.blackdomino.web.services.VentaServiceImpl;

@RestController
public class VentaApiRestController {
	@Autowired
	private VentaServiceImpl ventaServiceImpl;
	@Autowired
	private DTEServiceImpl dteServiceimpl;
	@Autowired
	private EstadoServiceImpl estadoServiceImpl;
	@Autowired
	private MedioPagoServiceImpl medioPagoServiceImpl;
	@Autowired
	private UsuarioServiceImpl usuarioServiceImpl;
	
	//Guardar
	@RequestMapping("/guardar/venta")
	public Venta guardarVenta(@RequestBody Venta venta,
			@RequestParam(value = "dteId", required = true)Long DteId,
			@RequestParam(value = "estadoId", required = true)Long EstadoId,
			@RequestParam(value = "medioPagoId", required = true)Long MedioPagoId,
			@RequestParam(value = "usuarioId", required = true)Long UsuarioId){
			DTE dte = dteServiceimpl.obtenerDTE(DteId);
			venta.setDte(dte);
			Estado estado = estadoServiceImpl.obtenerEstado(EstadoId);
			venta.setEstado(estado);
			MedioPago medioPago = medioPagoServiceImpl.obtenerMedioPago(MedioPagoId);
			venta.setMediopago(medioPago);
			Usuario usuario = usuarioServiceImpl.obtenerUsuario(UsuarioId);
			venta.setUsuario(usuario);
		return ventaServiceImpl.guardarVenta(venta);
	}
	
	//Eliminar
	@RequestMapping("/eliminar/venta")
	public String eliminarVenta(@RequestParam (value = "id", required= false)Long id) {
		return ventaServiceImpl.eliminarVenta(id);
	}
	
	//Actualizar
	@RequestMapping("/actualizar/venta")
	public String actualizarVenta(@RequestBody Venta venta) {
		if (venta.getId()!=null) {
			ventaServiceImpl.actualizarVenta(venta);
			String mensaje = ventaServiceImpl.actualizarVenta(venta);
			return mensaje;
		}
		return "Venta actualizada";
	}
	
	//Obtener
	@RequestMapping("/obtener/venta")
	public Venta obtenerVenta(@RequestParam(value="id", required = true)Long id) {
		Venta mensaje = ventaServiceImpl.obtenerVenta(id);
		System.out.println(mensaje.getId());
		return mensaje;
	}
	
	//Obtener Lista
	@GetMapping("/listar/ventas")
	public List<Venta> listadoVenta(){
		return ventaServiceImpl.listadoVenta();
	}
}

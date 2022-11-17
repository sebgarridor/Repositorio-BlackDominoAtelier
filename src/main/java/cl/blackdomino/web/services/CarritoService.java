package cl.blackdomino.web.services;

import cl.blackdomino.web.models.Carrito;

public interface CarritoService {
	
	//definiendo metodos
	
	public Carrito agregarCarrito(Carrito carrito);
	
	public String actualizarCantidad(Carrito carrito);
	
	public String eliminarCarrito(Long id);
	
	public Carrito verCarrito(Long id);

}

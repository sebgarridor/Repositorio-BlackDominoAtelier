package cl.blackdomino.web.services;

import java.util.List;
import java.util.Optional;

import cl.blackdomino.web.models.Producto;

public interface ProductoService {
	public Producto guardarProducto(Producto producto);
	public String eliminarProducto(Long id);
	public String actualizarProducto(Producto producto);
	public Optional<Producto> obtenerProducto(Long id);
	public List<Producto> obtenerListaProductos();	
}
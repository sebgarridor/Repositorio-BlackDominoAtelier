package cl.blackdomino.web.services;

import java.util.List;
import java.util.Optional;

import cl.blackdomino.web.models.Productos;

public interface ProductosService {
	public Productos guardarProducto(Productos producto);
	public String eliminarProducto(Long id);
	public String actualizarProducto(Productos producto);
	public Optional<Productos> obtenerProducto(Long id);
	public List<Productos> obtenerListaProductos();	
}

package cl.blackdomino.web.services;

import java.util.List;
import cl.blackdomino.web.models.Producto;

public interface ProductoService {
	public Boolean guardarProducto(Producto producto);
	public String eliminarProducto(Long id);
	public String actualizarProducto(Producto producto);
	public Producto obtenerProducto(Long id);
	public List<Producto> obtenerListaProductos();	
}

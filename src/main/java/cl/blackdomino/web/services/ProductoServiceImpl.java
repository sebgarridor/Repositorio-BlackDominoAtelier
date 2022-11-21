package cl.blackdomino.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Producto;
import cl.blackdomino.web.repositories.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;
	//--------------------Guardar----------------------------------
	@Override
	public Producto guardarProducto(Producto producto) {
		
		return productoRepository.save(producto);
	}
	//--------------------Eliminar----------------------------------
	@Override
	public String eliminarProducto(Long id) {
		Boolean existe = productoRepository.existsById(id);
		if (existe) {
			productoRepository.deleteById(id);
		} else {
			return "El producto no existe";
		}
		return "El producto fue eliminado";
	}
	
	//--------------------Actualizar----------------------------------
	@Override
	public String actualizarProducto(Producto producto) {
		Boolean existe = productoRepository.existsById(producto.getId());
		if (existe) {
			productoRepository.save(producto);
			return "Producto actualizado";
		}
		
		return "Producto no actualizado";
	}
	
	//--------------------Obtener----------------------------------
	@Override
	public Optional<Producto> obtenerProducto(Long id) {
		Optional<Producto> mensaje = productoRepository.findById(id);
		return mensaje;
	}
	
	//--------------------ObtenerLista----------------------------------
	@Override
	public List<Producto> obtenerListaProductos() {
		return productoRepository.findAll();
	}

	
}
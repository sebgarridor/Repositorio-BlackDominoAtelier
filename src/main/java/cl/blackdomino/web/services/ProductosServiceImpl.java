package cl.blackdomino.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Productos;
import cl.blackdomino.web.repositories.DisenosRepository;
import cl.blackdomino.web.repositories.ProductosRepository;

@Service
public class ProductosServiceImpl implements ProductosService{
	@Autowired
	private ProductosRepository productosRepository;
	//--------------------Guardar----------------------------------
	@Override
	public Productos guardarProducto(Productos producto) {
		// TODO Auto-generated method stub
		return productosRepository.save(producto);
	}
	//--------------------Eliminar----------------------------------
	@Override
	public String eliminarProducto(Long id) {
		Boolean existe = productosRepository.existsById(id);
		if (existe) {
			productosRepository.deleteById(id);
		} else {
			return "El producto no existe";
		}
		return "El producto fue eliminado";
	}
	
	//--------------------Actualizar----------------------------------
	@Override
	public String actualizarProducto(Productos producto) {
		Boolean existe = productosRepository.existsById(producto.getId());
		if (existe) {
			productosRepository.save(producto);
			return "Producto actualizado";
		}
		
		return "Producto no actualizado";
	}
	
	//--------------------Obtener----------------------------------
	@Override
	public Optional<Productos> obtenerProducto(Long id) {
		Optional<Productos> mensaje = productosRepository.findById(id);
		return mensaje;
	}
	
	//--------------------ObtenerLista----------------------------------
	@Override
	public List<Productos> obtenerListaProductos() {
		return productosRepository.findAll();
	}

	
}
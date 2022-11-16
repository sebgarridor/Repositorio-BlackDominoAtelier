package cl.blackdomino.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Productos;
import cl.blackdomino.web.repositories.ProductosRepository;

@Service
public class ProductosServiceImpl implements ProductosService{
	@Autowired
	private ProductosRepository productosRepository;
	
	@Override
	public Productos guardarProductos(Productos producto) {
		// TODO Auto-generated method stub
		return productosRepository.save(producto);
	}

	
}
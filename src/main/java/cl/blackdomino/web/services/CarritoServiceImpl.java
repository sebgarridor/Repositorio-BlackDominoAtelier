package cl.blackdomino.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Carrito;
import cl.blackdomino.web.repositories.CarritoRepository;

@Service
public class CarritoServiceImpl implements CarritoService{

	@Autowired
	private CarritoRepository carritoRepository;
	
	@Override
	public Carrito agregarCarrito(Carrito carrito) {
		
		return carritoRepository.save(carrito);
	}

	@Override
	public String actualizarCantidad(Carrito carrito) {
		
		Boolean existe = carritoRepository.existsById(carrito.getId());
		
		if(existe) {
			carritoRepository.save(carrito);
			return "El carrito ha sido actualizado";
		}
		
		return "Carrito creado";
	}

	@Override
	public String eliminarCarrito(Long id) {
		
		Boolean existe = carritoRepository.existsById(id);
		
		if(existe) {
			//elimino el carrito pasando el id del carrito
			carritoRepository.deleteById(id);
		}else { //si la ID del carrito no existe, nos retorna un mensaje de no-existencia
			return "Carrito no existe";
		}
		
		existe = carritoRepository.existsById(id);
		
		if(existe) {
			return "Carrito no eliminado";
		}
		return "El carrito fue eliminado";
	}

	@Override
	public Carrito verCarrito(Long id) {
		
		Boolean existe = carritoRepository.existsById(id);
		
		if(existe ) {
			Carrito carr = carritoRepository.findById(id).get();
			return carr;
		}
		return null;
	}
	
	

}

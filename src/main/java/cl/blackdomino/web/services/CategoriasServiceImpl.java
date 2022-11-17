package cl.blackdomino.web.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Categorias;
import cl.blackdomino.web.repositories.CategoriasRepository;

@Service
public class CategoriasServiceImpl implements CategoriasService{
	@Autowired
	private CategoriasRepository categoriasRepository;
	
//--------------------Guardar----------------------------------
	@Override
	public Categorias guardarCategoria(Categorias categoria) {
		return categoriasRepository.save(categoria);
	}
//--------------------Eliminar----------------------------------
	@Override
	public String eliminarCategoria(Long id) {
		Boolean existe = categoriasRepository.existsById(id);
		if (existe) {
			categoriasRepository.deleteById(id);
		} else {
			return "La categoría no existe";
		}
		existe = categoriasRepository.existsById(id);
		if (existe) {
			return "La categoría no fue eliminada";
		}
		return "La categoría fue eliminada";
	}
//--------------------Actualizar----------------------------------
	@Override
	public String actualizarCategoria(Categorias categoria) {
		Boolean existe = categoriasRepository.existsById(categoria.getId());
		if (existe) {
			categoriasRepository.save(categoria);
			return "Categoría Actualizada";
		}
		return "Categoría no actualizada";
	}
	//--------------------Obtener----------------------------------		
	@Override
	public Optional<Categorias> obtenerCategoria(Long id) {
		Optional<Categorias> mensaje = categoriasRepository.findById(id);
		return mensaje;
	}
	//--------------------ObtenerLista----------------------------------
	@Override
	public List<Categorias> obtenerListaCategorias() {
		return categoriasRepository.findAll();
	}

}

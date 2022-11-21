package cl.blackdomino.web.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Categoria;
import cl.blackdomino.web.repositories.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{
	@Autowired
	private CategoriaRepository categoriaRepository;
	
//--------------------Guardar----------------------------------
	@Override
	public Categoria guardarCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
//--------------------Eliminar----------------------------------
	@Override
	public String eliminarCategoria(Long id) {
		Boolean existe = categoriaRepository.existsById(id);
		if (existe) {
			categoriaRepository.deleteById(id);
		} else {
			return "La categoría no existe";
		}
		existe = categoriaRepository.existsById(id);
		if (existe) {
			return "La categoría no fue eliminada";
		}
		return "La categoría fue eliminada";
	}
//--------------------Actualizar----------------------------------
	@Override
	public String actualizarCategoria(Categoria categoria) {
		Boolean existe = categoriaRepository.existsById(categoria.getId());
		if (existe) {
			categoriaRepository.save(categoria);
			return "Categoría Actualizada";
		}
		return "Categoría no actualizada";
	}
	//--------------------Obtener----------------------------------		
	@Override
	public Optional<Categoria> obtenerCategoria(Long id) {
		Optional<Categoria> mensaje = categoriaRepository.findById(id);
		return mensaje;
	}
	//--------------------ObtenerLista----------------------------------
	@Override
	public List<Categoria> obtenerListaCategorias() {
		return categoriaRepository.findAll();
	}

}

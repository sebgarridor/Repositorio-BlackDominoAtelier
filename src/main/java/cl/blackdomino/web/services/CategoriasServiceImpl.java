package cl.blackdomino.web.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Categorias;
import cl.blackdomino.web.repositories.CategoriasRepository;

@Service
public class CategoriasServiceImpl implements CategoriasService{
	@Autowired
	private CategoriasRepository categoriasRepository;
	@Override
	public Categorias guardarCategorias(Categorias categoria) {
		
		return categoriasRepository.save(categoria);
	}

}

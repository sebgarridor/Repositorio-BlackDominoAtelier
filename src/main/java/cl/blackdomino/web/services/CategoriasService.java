package cl.blackdomino.web.services;

import java.util.List;
import java.util.Optional;

import cl.blackdomino.web.models.Categorias;

public interface CategoriasService {
	public Categorias guardarCategoria(Categorias categoria);
	public String eliminarCategoria(Long id);
	public String actualizarCategoria(Categorias categoria);
	public Optional<Categorias> obtenerCategoria(Long id);
	public List<Categorias> obtenerListaCategorias();
}

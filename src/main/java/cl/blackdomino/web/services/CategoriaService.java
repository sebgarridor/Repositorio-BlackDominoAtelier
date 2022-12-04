package cl.blackdomino.web.services;


import java.util.List;

import cl.blackdomino.web.models.Categoria;

public interface CategoriaService {
	public Categoria guardarCategoria(Categoria categoria);
	public String eliminarCategoria(Long id);
	public String actualizarCategoria(Categoria categoria);
	public Categoria obtenerCategoria(Long id);
	public List<Categoria> obtenerListaCategorias();
}

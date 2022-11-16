package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.blackdomino.web.models.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Long> {
	
}

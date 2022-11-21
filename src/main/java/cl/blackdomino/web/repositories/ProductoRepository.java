package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.blackdomino.web.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
	
}

package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.blackdomino.web.models.Carrito;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long> {

}

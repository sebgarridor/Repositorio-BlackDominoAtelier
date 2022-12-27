package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl.blackdomino.web.models.Cantidad;

@Repository
public interface CantidadRepository extends JpaRepository<Cantidad, Long> {

}

package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.blackdomino.web.models.Direccion;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long>{

}

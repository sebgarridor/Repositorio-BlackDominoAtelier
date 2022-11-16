package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.blackdomino.web.models.MedioPago;

@Repository
public interface MedioPagosRepository extends JpaRepository<MedioPago, Long>{

}

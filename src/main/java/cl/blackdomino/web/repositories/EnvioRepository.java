package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl.blackdomino.web.models.Envio;

@Repository
public interface EnvioRepository extends JpaRepository<Envio, Long> {

}

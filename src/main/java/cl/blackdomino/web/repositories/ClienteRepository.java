package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.blackdomino.web.models.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Long>{


}

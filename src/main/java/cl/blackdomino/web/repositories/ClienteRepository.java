package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.blackdomino.web.models.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, String>{

	

}

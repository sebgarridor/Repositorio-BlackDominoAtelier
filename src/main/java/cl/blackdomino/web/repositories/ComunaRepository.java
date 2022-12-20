package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.blackdomino.web.models.Comuna;

public interface ComunaRepository extends JpaRepository<Comuna, Long>{
	
}

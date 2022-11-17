package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.blackdomino.web.models.Dueno;

@Repository
public interface DuenoRepository extends JpaRepository<Dueno, Long>{
	
	//Nos conectamos con la base de datos

}

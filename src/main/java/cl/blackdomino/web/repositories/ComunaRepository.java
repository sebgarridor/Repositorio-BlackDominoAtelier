package cl.blackdomino.web.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import cl.blackdomino.web.models.Comuna;

public interface ComunaRepository extends JpaRepository<Comuna, Long>{
	//JPQL 	lista de todas las comunas de una región
	@Query("select c from Comuna c where c.region.id = ?1")
	List<Comuna> findAllByRegion(Long id);
	
}

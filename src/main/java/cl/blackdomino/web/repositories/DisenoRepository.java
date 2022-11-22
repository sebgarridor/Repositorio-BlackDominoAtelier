package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.blackdomino.web.models.Diseno;

@Repository
public interface DisenoRepository extends JpaRepository<Diseno, Long>{

}

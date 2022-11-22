package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.blackdomino.web.models.Tallaje;

@Repository
public interface TallajeRepository extends JpaRepository<Tallaje, Long>{

}

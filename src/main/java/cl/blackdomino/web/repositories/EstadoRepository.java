package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.blackdomino.web.models.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado,Long>{
    
}
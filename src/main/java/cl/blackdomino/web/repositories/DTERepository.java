package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.blackdomino.web.models.DTE;

@Repository
public interface DTERepository extends JpaRepository<DTE,Long> {
    
}

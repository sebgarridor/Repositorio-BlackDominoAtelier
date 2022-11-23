package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.blackdomino.web.models.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta,Long>{
    
}
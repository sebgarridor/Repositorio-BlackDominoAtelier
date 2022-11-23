package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.blackdomino.web.models.ProductosVentas;

@Repository
public interface ProductosVentasRepository extends JpaRepository<ProductosVentas,Long>{
    
}
package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.blackdomino.web.models.Envios;

@Repository
public interface EnviosRepository extends JpaRepository<Envios, Long>{
//logica de manipulacion de datos
}

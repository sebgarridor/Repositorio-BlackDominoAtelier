package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.blackdomino.web.models.Administradores;

@Repository
public interface AdministradorRepository extends JpaRepository<Administradores, Long>{

}

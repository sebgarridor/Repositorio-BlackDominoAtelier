package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.blackdomino.web.models.Administradores;

public interface AdministradorRepository extends JpaRepository<Administradores, Long>{

}

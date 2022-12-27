package cl.blackdomino.web.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.blackdomino.web.models.ERole;
import cl.blackdomino.web.models.Rol;



@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
  Optional<Rol> findByNombre(ERole nombre);
}
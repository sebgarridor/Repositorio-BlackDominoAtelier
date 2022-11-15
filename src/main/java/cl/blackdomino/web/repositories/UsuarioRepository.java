package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.blackdomino.web.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}

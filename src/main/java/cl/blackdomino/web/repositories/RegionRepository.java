package cl.blackdomino.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl.blackdomino.web.models.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long>{

}

package cl.blackdomino.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Region;
import cl.blackdomino.web.repositories.RegionRepository;

@Service
public class RegionServiceImpl implements RegionService {
	
	@Autowired
	private RegionRepository regionRepository;
	
	@Override
	public Region guardarRegion(Region region) {
		return regionRepository.save(region);
	}
	
	@Override
	public String actualizarRegion(Region region) {
		Boolean existe = regionRepository.existsById(region.getId());
		if(existe){
			regionRepository.save(region);
			return "Región actualizada";
		}
		return "Región no actualizada";
	}


	@Override
	public Region obtenerRegion(Long Id) {
		Boolean existe = regionRepository.existsById(Id);
		if(existe){
			Region mensaje = regionRepository.findById(Id).get();
			return mensaje;
		}
		
		return null;
	}

	@Override
	public List<Region> obtenerRegiones() {
		return regionRepository.findAll();
	}

}

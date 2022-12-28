package cl.blackdomino.web.services;

import java.util.List;

import cl.blackdomino.web.models.Region;

public interface RegionService {
	public Region guardarRegion(Region region);
	public Region obtenerRegion (Long Id);
	public String actualizarRegion(Region region);
	public List<Region> obtenerRegiones();
}
package cl.blackdomino.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Envioproducto;
import cl.blackdomino.web.repositories.EnvioproductoRepository;

@Service
public class EnvioproductoServiceImpl implements EnvioproductoService{
	
	@Autowired
	private EnvioproductoRepository envioproductoRepository;

	@Override
	public Envioproducto agregarCalculoSubtotal(Envioproducto envioproducto) {
		// TODO Auto-generated method stub
		return null;
	}

}

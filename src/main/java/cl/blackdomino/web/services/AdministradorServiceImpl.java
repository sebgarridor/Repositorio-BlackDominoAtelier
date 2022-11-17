package cl.blackdomino.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Administradores;
import cl.blackdomino.web.repositories.AdministradorRepository;


@Service
public class AdministradorServiceImpl implements AdministradorService{

	@Autowired // inyección
	private AdministradorRepository administradorRepository;


	@Override
	public Administradores guardarAdministrador(Administradores administrador) {
		// TODO Auto-generated method stub
		return administradorRepository.save(administrador);
	}

	@Override
	public String eliminarAdministrador(Long id) {
		Boolean existe  = administradorRepository.existsById(id);
		
		if(existe) {
			administradorRepository.deleteById(id);
		}else {
			return "Usuario no existe en la tabla";
		}
		existe = administradorRepository.existsById(id);
		//Optional<Usuario> usuario = usuarioRepositry.findById(id);
		if(existe) {
			return "Usuario no eliminado";
		}
		return "El usuario fue eliminado";
	}

	@Override
	public String actualizarAdministador(Administradores administrador) {
		Boolean existe = administradorRepository.existsById(administrador.getId());
		if(existe) {
			administradorRepository.save(administrador);
			return "Usuario actualizado";
		}
		return "Usuario creado";
	}

	@Override
	public Administradores obtenerAdministrador(Long id) {
		Administradores admin = administradorRepository.findById(id).get();
		return admin;
	}

	@Override
	public List<Administradores> obtenerListaAdministradores() {
		// TODO Auto-generated method stub
		return administradorRepository.findAll();
	}
	}
	


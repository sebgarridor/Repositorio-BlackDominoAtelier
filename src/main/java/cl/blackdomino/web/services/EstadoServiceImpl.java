package cl.blackdomino.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Estado;
import cl.blackdomino.web.repositories.EstadoRepository;

@Service
public class EstadoServiceImpl implements EstadoService{

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public Estado guardarEstado(Estado estado) {
        return estadoRepository.save(estado);
    }

    @Override
    public String eliminarEstado(Long id) {
        Boolean existe = estadoRepository.existsById(id);
        if(existe){
            estadoRepository.deleteById(id);
        }else{
            return "El estado no existe";
        }
        Boolean existe2 = estadoRepository.existsById(id);
        if(existe2){
            return "El estado no fue eliminado";
        }
        return "El estado fue eliminado";
    }

    @Override
    public String actualizarEstado(Estado estado) {
        Boolean existe = estadoRepository.existsById(estado.getId());
        if(existe){
            estadoRepository.save(estado);
            return "El estado se actualizó";
        }
        return "El estado no se actualizó";
    }

    @Override
    public Estado obtenerEstado(Long id) {
        Estado mensaje = estadoRepository.findById(id).get();
        return mensaje;
    }

    @Override
    public List<Estado> listadoEstado() {
        
        return estadoRepository.findAll();
    }
    
}
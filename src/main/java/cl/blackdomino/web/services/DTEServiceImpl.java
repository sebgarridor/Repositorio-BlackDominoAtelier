package cl.blackdomino.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.DTE;
import cl.blackdomino.web.repositories.DTERepository;

@Service
public class DTEServiceImpl implements DTEService{

    @Autowired
    private DTERepository dteRepository;

    @Override
    public DTE guardarDTE(DTE dte) {
        return dteRepository.save(dte);
    }

    @Override
    public String eliminarDTE(Long id) {
        Boolean existe = dteRepository.existsById(id);
        if(existe){
            dteRepository.deleteById(id);
        }else{
            return "DTE no existe";
        }
        existe = dteRepository.existsById(id);
        if(existe){
            return "DTE no fue eliminado";
        }
        return "DTE fue eliminado";
    }

    @Override
    public String actualizarDTE(DTE dte) {
        Boolean existe = dteRepository.existsById(dte.getId());
        if(existe){
            dteRepository.save(dte);
        }else{
            return "No existe el DTE";
        }
        return "El DTE fue actualiazdo";
    }

    @Override
    public DTE obtenerDTE(Long id) {
        DTE mensaje = dteRepository.findById(id).get();
        return mensaje;
    }

    @Override
    public List<DTE> listadoDTE() {
        return dteRepository.findAll();
    }
    
}
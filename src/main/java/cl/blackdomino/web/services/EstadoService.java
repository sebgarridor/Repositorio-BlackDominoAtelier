package cl.blackdomino.web.services;

import java.util.List;

import cl.blackdomino.web.models.Estado;

public interface EstadoService {
    public Estado guardarEstado(Estado estado);
    public String eliminarEstado(Long id);
    public String actualizarEstado(Estado estado);
    public Estado obtenerEstado(Long id);
    public List<Estado> listadoEstado();
    
}
package cl.blackdomino.web.services;

import java.util.List;

import cl.blackdomino.web.models.DTE;

public interface DTEService {
    public DTE guardarDTE(DTE dte);
    public String eliminarDTE(Long id);
    public String actualizarDTE(DTE dte);
    public DTE obtenerDTE(Long id);
    public List<DTE> listadoDTE();
    
}
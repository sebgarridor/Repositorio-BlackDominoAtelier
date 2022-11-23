package cl.blackdomino.web.services;

import java.util.List;

import cl.blackdomino.web.models.Venta;

public interface VentaService {
    public Venta guardarVenta(Venta venta);
    public String eliminarVenta(Long id);
    public String actualizarVenta(Venta venta);
    public Venta obtenerVenta(Long id);
    public List<Venta> listadoVenta();
    
}
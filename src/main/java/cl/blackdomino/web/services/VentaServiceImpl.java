package cl.blackdomino.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.Venta;
import cl.blackdomino.web.repositories.VentaRepository;

@Service
public class VentaServiceImpl implements VentaService{

    @Autowired
    private VentaRepository ventaRepository;

//--------------------Guardar----------------------------------
    @Override
    public Venta guardarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }
//--------------------Eliminar----------------------------------
    @Override
    public String eliminarVenta(Long id) {
        Boolean existe = ventaRepository.existsById(id);
        if(existe){
            ventaRepository.deleteById(id);
        }else{
            return "La venta no existe";
        }
        existe = ventaRepository.existsById(id);
        if(existe){
            return "La venta no fue eliminada";
        }
        return "La venta fue eliminada";
    }
//--------------------Actualizar----------------------------------
    @Override
    public String actualizarVenta(Venta venta) {
        Boolean existe = ventaRepository.existsById(venta.getId());
        if(existe){
            ventaRepository.save(venta);
        }else{
            return "La venta no fue actualizada";
        }
        return "La venta fue actualizada";
    }
//--------------------Obtener----------------------------------	
    @Override
    public Venta obtenerVenta(Long id) {
        Venta mensaje = ventaRepository.findById(id).get();
    return mensaje;
    }
//--------------------ObtenerLista----------------------------------
    @Override
    public List<Venta> listadoVenta() {
        return ventaRepository.findAll();
    }
    
}
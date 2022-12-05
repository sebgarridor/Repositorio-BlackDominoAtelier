package cl.blackdomino.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.blackdomino.web.models.ProductosVentas;
import cl.blackdomino.web.repositories.ProductosVentasRepository;

@Service
public class ProductosVentasServiceImpl implements ProductosVentasService{

    @Autowired
    private ProductosVentasRepository pvRepository;

//--------------------Guardar---------------------------------- 
    @Override
    public ProductosVentas guardarPV(ProductosVentas pd) {
        return pvRepository.save(pd);
    }
//--------------------Eliminar----------------------------------
    @Override
    public String eliminarPV(Long id) {
        Boolean existe = pvRepository.existsById(id);
        if(existe){
            pvRepository.deleteById(id);
        }
        existe = pvRepository.existsById(id);
        if(existe){
            return "El producto venta no fue eliminado";
        }
        return "El producto venta fue eliminado";
    }
//--------------------Actualizar----------------------------------
    @Override
    public String actualizarPV(ProductosVentas pd) {
        Boolean existe = pvRepository.existsById(pd.getId());
        if(existe){
            pvRepository.save(pd);
        }else{
            return "El producto venta no existe";
        }
        return "El producto venta fue actualizado";
    }
//--------------------Obtener----------------------------------	
    @Override
    public ProductosVentas obtenerPV(Long id) {
    	Boolean existe = pvRepository.existsById(id);
    	if(existe) {
    	 ProductosVentas mensaje = pvRepository.findById(id).get();
        return mensaje;	
    	}
       return null;
    }
//--------------------ObtenerLista----------------------------------
    @Override
    public List<ProductosVentas> listadoPV() {
        return pvRepository.findAll();
    }
    
}
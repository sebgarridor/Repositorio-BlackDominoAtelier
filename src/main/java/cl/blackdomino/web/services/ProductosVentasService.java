package cl.blackdomino.web.services;

import java.util.List;

import cl.blackdomino.web.models.ProductosVentas;

public interface ProductosVentasService {
    public ProductosVentas guardarPV(ProductosVentas pd);
    public String eliminarPV(Long id);
    public String actualizarPV(ProductosVentas pd);
    public ProductosVentas obtenerPV(Long id);
    public List<ProductosVentas> listadoPV();
}
package cl.blackdomino.web.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="envio_producto")
public class Envio_producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long envioId;
	

	private Long productoId;
	
	@NotNull
	private int cant_producto;
	
	@NotNull
	private int subtotal;

	public Envio_producto() {
		super();
	}

	public Envio_producto(Long id, Long envioId, Long productoId, @NotNull int cant_producto,
			@NotNull int subtotal) {
		super();
		this.id = id;
		this.envioId = envioId;
		this.productoId = productoId;
		this.cant_producto = cant_producto;
		this.subtotal = subtotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEnvioId() {
		return envioId;
	}

	public void setEnvioId(Long envioId) {
		this.envioId = envioId;
	}

	public Long getProductoId() {
		return productoId;
	}

	public void setProductoId(Long productoId) {
		this.productoId = productoId;
	}

	public int getCant_producto() {
		return cant_producto;
	}

	public void setCant_producto(int cant_producto) {
		this.cant_producto = cant_producto;
	}

	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}
	
	
	

}

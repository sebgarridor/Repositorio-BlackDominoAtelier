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
	
	@NotNull
	private int envio_id;
	
	@NotNull
	private int producto_id;
	
	@NotNull
	private int cant_producto;
	
	@NotNull
	private int subtotal;

	public Envio_producto() {
		super();
	}

	public Envio_producto(Long id, @NotNull int envio_id, @NotNull int producto_id, @NotNull int cant_producto,
			@NotNull int subtotal) {
		super();
		this.id = id;
		this.envio_id = envio_id;
		this.producto_id = producto_id;
		this.cant_producto = cant_producto;
		this.subtotal = subtotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getEnvio_id() {
		return envio_id;
	}

	public void setEnvio_id(int envio_id) {
		this.envio_id = envio_id;
	}

	public int getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(int producto_id) {
		this.producto_id = producto_id;
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

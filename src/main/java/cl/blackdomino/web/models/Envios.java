package cl.blackdomino.web.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity 
@Table(name="envios")
public class Envios{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tipoEnvio;
	private int costoEnvio;
	
	@NotNull
	@Size(min=3, max=30,message="Error en el ingreso de la region")
	private String regionEnvio;
	
	private int total;
	
	private Long medioPagoId;
	
	private Long carritoId;
	
	private Long clienteId;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy_MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy_MM-dd")
	private Date updatedAt;
	
	public Envios() {
		super();
	}

	
	
	
	
	public Envios(Long id, String tipoEnvio, int costoEnvio,
			@NotNull @Size(min = 3, max = 30, message = "Error en el ingreso de la region") String regionEnvio,
			int total, Long medioPagoId, Long carritoId, Long clienteId, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.tipoEnvio = tipoEnvio;
		this.costoEnvio = costoEnvio;
		this.regionEnvio = regionEnvio;
		this.total = total;
		this.medioPagoId = medioPagoId;
		this.carritoId = carritoId;
		this.clienteId = clienteId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}





		public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getTipoEnvio() {
		return tipoEnvio;
	}





	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}





	public int getCostoEnvio() {
		return costoEnvio;
	}





	public void setCostoEnvio(int costoEnvio) {
		this.costoEnvio = costoEnvio;
	}





	public String getRegionEnvio() {
		return regionEnvio;
	}





	public void setRegionEnvio(String regionEnvio) {
		this.regionEnvio = regionEnvio;
	}





	public int getTotal() {
		return total;
	}





	public void setTotal(int total) {
		this.total = total;
	}





	public Long getMedioPagoId() {
		return medioPagoId;
	}





	public void setMedioPagoId(Long medioPagoId) {
		this.medioPagoId = medioPagoId;
	}





	public Long getCarritoId() {
		return carritoId;
	}





	public void setCarritoId(Long carritoId) {
		this.carritoId = carritoId;
	}





	public Long getClienteId() {
		return clienteId;
	}





	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}



		//atributos de control
		//agrega a la columna la fecha antes de insertar
		@PrePersist
		    protected void onCreate(){
		        this.createdAt = new Date();
		    }
		//fecha en la que se actualiza
		    @PreUpdate
		    protected void onUpdate(){
		        this.updatedAt = new Date();
		    }
}

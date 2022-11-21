package cl.blackdomino.web.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity 
@Table(name="dte")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DTE {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String observacion;
	
	private Long envioId;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy_MM-dd")
	private Date createdAt;
	
	
	public DTE() {
		super();
	}
	
	
	
	public DTE(Long id, String observacion, Long envioId, Date createdAt) {
		super();
		this.id = id;
		this.observacion = observacion;
		this.envioId = envioId;
		this.createdAt = createdAt;
	}


	




	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getObservacion() {
		return observacion;
	}



	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}



	public Long getEnvioId() {
		return envioId;
	}



	public void setEnvioId(Long envioId) {
		this.envioId = envioId;
	}





		//atributos de control
		//agrega a la columna la fecha antes de insertar
		@PrePersist
		    protected void onCreate(){
		        this.createdAt = new Date();
		    }
		
}

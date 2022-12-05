package cl.blackdomino.web.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	@JsonIgnore
	@OneToMany(mappedBy="dte",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Venta> venta;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy_MM-dd")
	private Date createdAt;
	
	//atributos de control
	//agrega a la columna la fecha antes de insertar
	@PrePersist
	protected void onCreate(){
	this.createdAt = new Date();
	}
		
}

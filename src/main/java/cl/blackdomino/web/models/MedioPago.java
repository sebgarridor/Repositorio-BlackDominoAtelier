package cl.blackdomino.web.models;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity 
@Table(name="mediosPagos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MedioPago {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private String descripcion;
	
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY,mappedBy="mediopago",cascade=CascadeType.ALL)
	private List<Venta> venta;

	
	

}

package cl.blackdomino.web.models;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
	
	@NotNull
	@Size(min=3, max=15,message="Error en el ingreso del nombre")
	private String nombre;
	
	private String descripcion;
	
	@JsonIgnore
	@OneToOne(fetch=FetchType.LAZY,mappedBy="mediopago",cascade=CascadeType.ALL)
	private Venta venta;

	//colocar nombres referenciales en minuscula sin guion
	

}

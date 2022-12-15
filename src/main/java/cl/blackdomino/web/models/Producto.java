package cl.blackdomino.web.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "productos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	private String nombre;
	

	private Integer precio;

	private Integer cantidad;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="categoria_id")
	private Categoria categoria;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="diseno_id")
	private Diseno diseno;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="tallaje_id")
	private Tallaje tallaje;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="coleccion_id")
	private Coleccion coleccion;

	//ManyToMany
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name="productos_ventas",
			joinColumns = @JoinColumn(name="producto_id"),
			inverseJoinColumns = @JoinColumn(name="venta_id")			
			)
	private List<Venta> ventas;
	
	}	
	


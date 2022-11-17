package cl.blackdomino.web.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "productos")
public class Productos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String nombre;
	@NotNull
	private Integer precio;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="categoria_id")
	private Categorias categoria;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="diseno_id")
	private Disenos diseno;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="tallaje_id")
	private Tallaje tallaje;

	public Productos() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}



}

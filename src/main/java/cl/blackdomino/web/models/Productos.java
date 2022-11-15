package cl.blackdomino.web.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Productos")
public class Productos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Long id;
	@NotNull
	private String nombre;
	@NotNull
	private Integer precio;
	@NotNull
	private Long categoria_id;
	@NotNull
	private Long diseno_id;
	@NotNull
	private Long tallaje_id;

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

	public Long getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(Long categoria_id) {
		this.categoria_id = categoria_id;
	}

	public Long getDiseno_id() {
		return diseno_id;
	}

	public void setDiseno_id(Long diseno_id) {
		this.diseno_id = diseno_id;
	}

	public Long getTallaje_id() {
		return tallaje_id;
	}

	public void setTallaje_id(Long tallaje_id) {
		this.tallaje_id = tallaje_id;
	}

}

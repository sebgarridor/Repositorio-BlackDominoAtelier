package cl.blackdomino.web.models;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "roles")
public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	//se indica que va a ser un enum de tipo String
	@Enumerated(EnumType.STRING)
	private NombreRol nombre;

	//constructores
	public Rol() {
		super();
	}

	public Rol(@NotNull NombreRol nombre) {
		super();
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public NombreRol getNombre() {
		return nombre;
	}

	public void setNombre(NombreRol nombre) {
		this.nombre = nombre;
	}
	
	

}

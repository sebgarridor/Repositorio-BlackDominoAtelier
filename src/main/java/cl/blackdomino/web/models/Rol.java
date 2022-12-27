package cl.blackdomino.web.models;

import javax.persistence.*;



@Entity
@Table(name = "roles")
public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ERole nombre;

	public Rol() {
		super();
	}

	public Rol(ERole nombre) {
		super();
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ERole getNombre() {
		return nombre;
	}

	public void setNombre(ERole nombre) {
		this.nombre = nombre;
	}
	
	

}

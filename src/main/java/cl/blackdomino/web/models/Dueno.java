package cl.blackdomino.web.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="dueno")

public class Dueno {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String password;
	
	
	private Long rolId;
	

	private Long usuarioId;


	public Dueno() {
		super();
	}


	public Dueno(Long id, @NotNull String password, Long rolId, Long usuarioId) {
		super();
		this.id = id;
		this.password = password;
		this.rolId = rolId;
		this.usuarioId = usuarioId;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Long getRolId() {
		return rolId;
	}


	public void setRolId(Long rolId) {
		this.rolId = rolId;
	}


	public Long getUsuarioId() {
		return usuarioId;
	}


	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}


	
	
}
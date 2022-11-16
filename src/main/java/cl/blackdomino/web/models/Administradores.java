package cl.blackdomino.web.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "administrador")
public class Administradores {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 5, max = 30)
	private String password;

	private Long rolId;
	private Long usuarioId;

	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date createdAt;

	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date updateAt;

	public Administradores(Long id, @NotNull @Size(min = 5, max = 30) String password, Long rolId,
			Long usuarioId) {
		super();
		this.id = id;
		this.password = password;
		this.rolId = rolId;
		this.usuarioId = usuarioId;
	}

	public Administradores() {
		super();
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

	public void setRol_id(Long rolId) {
		this.rolId = rolId;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuario_id(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	protected void onCreate() {
		this.createdAt = new Date();
	}

	protected void onUpdate() {
		this.updateAt = new Date();
	}
}

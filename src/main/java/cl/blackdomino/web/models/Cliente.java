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
@Table(name = "clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private Boolean empresa;
	
	@NotNull
	@Size(min = 9, max = 10)
	private String rut;
	
	private Long usuarioId;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date createdAt;

	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date updateAt;
	
	
	public Cliente() {
		super();
	}

	public Cliente(Long id, @NotNull Boolean empresa, @NotNull @Size(min = 9, max = 10) String rut, Long usuarioId,
			Date createdAt, Date updateAt) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.rut = rut;
		this.usuarioId = usuarioId;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Boolean empresa) {
		this.empresa = empresa;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	protected void onCreate() {
		this.createdAt = new Date();
	}

	protected void onUpdate() {
		this.updateAt = new Date();
	}
}

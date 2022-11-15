package cl.blackdomino.web.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="direcciones")


public class Direccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String calle;
	
	@NotNull
	private int numero;
	
	@NotNull
	private String comuna;
	
	@NotNull
	private String ciudad;
	
	@NotNull
	private String region;
	
	@NotNull
	private String departamento;
	
	@NotNull
	private String codigoPostal;

	public Direccion() {
		super();
	}

	public Direccion(Long id, @NotNull String calle, @NotNull int numero, @NotNull String comuna,
			@NotNull String ciudad, @NotNull String region, @NotNull String departamento,
			@NotNull String codigoPostal) {
		super();
		this.id = id;
		this.calle = calle;
		this.numero = numero;
		this.comuna = comuna;
		this.ciudad = ciudad;
		this.region = region;
		this.departamento = departamento;
		this.codigoPostal = codigoPostal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

}

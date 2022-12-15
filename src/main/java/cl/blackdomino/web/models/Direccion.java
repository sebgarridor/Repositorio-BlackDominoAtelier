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
	
	import com.fasterxml.jackson.annotation.JsonIgnore;
	
	import lombok.AllArgsConstructor;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;
	import lombok.ToString;

	@Entity
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@ToString
	@Table(name = "direcciones")
	public class Direccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String calle;

	@NotNull
	private Integer numero;

	@NotNull
	private String comuna;

	@NotNull
	private String ciudad;

	@NotNull
	private String region;

	private String departamento;

	private String codigoPostal;

	@OneToOne(mappedBy = "direccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Usuario usuario;

}

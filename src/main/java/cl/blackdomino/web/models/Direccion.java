	package cl.blackdomino.web.models;
	
	import java.util.List;

import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	private String direccion;

	@NotNull
	private String ciudad;

	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name="direcciones_comunas", //nombre tabla
			joinColumns= @JoinColumn(name="direccion_id"),
			inverseJoinColumns= @JoinColumn(name="comuna_id")
			)
	private List<Comuna> comunas;

	private String departamento;


	@OneToOne(mappedBy = "direccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Usuario usuario;

}

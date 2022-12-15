	package cl.blackdomino.web.models;
	
	
	import java.util.List;
	
	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToMany;
	
	import javax.persistence.Table;
	
	
	import com.fasterxml.jackson.annotation.JsonIgnore;
	
	import lombok.AllArgsConstructor;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;
	
	
	
	@Entity
	@Table(name="roles")
	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public class Rol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String rol;
	
	private String descripcion;
	
	//Relación ManyToMany
	@JsonIgnore
	@ManyToMany(mappedBy = "roles",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Usuario> usuarios;

	//hacer referencia nombres tablas
	
}

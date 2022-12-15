	package cl.blackdomino.web.models;
	
	import java.util.List;
	
	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;
	
	import com.fasterxml.jackson.annotation.JsonIgnore;
	import lombok.AllArgsConstructor;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;
	import lombok.ToString;
	
	
	@Entity
	@Table(name = "disenos")
	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	@ToString
	public class Diseno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String serigrafia;
	
	private Integer colores;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="coleccion_id")
	private Coleccion coleccion;
	
	@JsonIgnore
	@OneToMany(mappedBy = "diseno", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Producto> productos;

}

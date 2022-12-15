		package cl.blackdomino.web.models;
		
		import java.util.List;
		
		import javax.persistence.CascadeType;
		import javax.persistence.Entity;
		import javax.persistence.FetchType;
		import javax.persistence.GeneratedValue;
		import javax.persistence.GenerationType;
		import javax.persistence.Id;
		import javax.persistence.OneToMany;
		import javax.persistence.Table;
		
		
		import com.fasterxml.jackson.annotation.JsonIgnore;
		
		import lombok.AllArgsConstructor;
		import lombok.Getter;
		import lombok.NoArgsConstructor;
		import lombok.Setter;
		
		
		@Entity
		@Table(name="tallajes")
		@Getter
		@Setter
		@AllArgsConstructor
		@NoArgsConstructor
		public class Tallaje {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		private String talla;
		
		@JsonIgnore
		@OneToMany(mappedBy = "tallaje",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
		private List<Producto> productos;


	
}

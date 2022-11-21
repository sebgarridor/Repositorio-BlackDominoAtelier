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
import javax.validation.constraints.NotNull;


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

	@NotNull
	private String Nombre;
	
	private String descripcion;
	
	//Relación ManyToMany
	@ManyToMany(mappedBy = "roles",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Usuario> usuarios;
	
}

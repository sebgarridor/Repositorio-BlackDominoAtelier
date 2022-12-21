package cl.blackdomino.web.models;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.data.annotation.Transient;

/*Una entidad es un objeto, elemento o 'cosa'
 *  con atributos particulares que lo distinguen. 
 *  
 * UniqueConstraint se aplica en una sola columna (o columnas) 
 * para asegurarse de que un valor de clave principal es único.*/
@Entity
@Table(name = "usuarios"
//,uniqueConstraints = @UniqueConstraint(columnNames = "correo")
)
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nombre;
	
	@NotNull
	private String apellido;
	
	@Size(min = 6)
	@NotNull
	private String password;
	
	//campo o propiedad que no será serializada
	//no se agregará como columna
	@Transient
	private String password2;
	
	//especifica que debe tener la estructura de un correo (semántica)
	//es lo mismo que uniqueConstraints, puedes usar uno de los dos
	//se usa este cuando son pocos
	@Email
	@NotNull
	@Column(unique = true)
	private String correo;
	
	//relación many to many
	//un usuario-->muchos roles
	//un rol-->muchos usuarios
	//tabla intermedia que tiene dos campos
	//joinColumns hace referencia a la columna que hace referencia a los campos
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "roles_usuarios",
	joinColumns = @JoinColumn(name = "rol_id"),
	inverseJoinColumns = @JoinColumn(name = "usuario_id"))
	private Set<Rol> roles = new HashSet<>();

	//constructores
		public Usuario() {
		super();
	}

		public Usuario(@NotNull String nombre, @NotNull String apellido, @Size(min = 6) @NotNull String password,
				String password2, @Email String correo) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.password = password;
			this.password2 = password2;
			this.correo = correo;
		}
	
	

}

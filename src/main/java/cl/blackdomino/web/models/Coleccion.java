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

@Entity
@Table(name = "colecciones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coleccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String coleccion;
	
	@JsonIgnore
	@OneToMany(mappedBy = "coleccion",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List <Diseno> disenos;

	
	@JsonIgnore
	@OneToMany(mappedBy = "coleccion",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Producto> productos;
}

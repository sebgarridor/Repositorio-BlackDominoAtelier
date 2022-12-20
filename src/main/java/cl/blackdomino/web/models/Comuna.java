package cl.blackdomino.web.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="comunas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Comuna {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	private String comuna;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="region_id")
	private Region region;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "comunas",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Direccion> direccion;
	
	
}

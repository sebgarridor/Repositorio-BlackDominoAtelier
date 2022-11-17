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
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "disenos")
public class Disenos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String serigrafia;
	
	@JsonIgnore
	@OneToMany(mappedBy = "diseno", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Productos> productos;

	public Disenos() {
		super();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSerigrafia() {
		return serigrafia;
	}

	public void setSerigrafia(String serigrafia) {
		this.serigrafia = serigrafia;
	}





}

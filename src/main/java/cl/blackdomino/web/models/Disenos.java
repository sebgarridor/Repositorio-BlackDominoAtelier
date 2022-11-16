package cl.blackdomino.web.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Disenos")
public class Disenos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String serigrafia;

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

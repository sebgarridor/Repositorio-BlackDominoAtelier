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
@Table(name="tallajes")

public class Tallaje {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotNull
		private String talla;
		
		@JsonIgnore
		@OneToMany(mappedBy = "tallaje",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
		private List<Productos> productos;


		public Tallaje() {
			super();
		}

		public Tallaje(Long id, @NotNull String talla) {
			super();
			this.id = id;
			this.talla = talla;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTalla() {
			return talla;
		}

		public void setTalla(String talla) {
			this.talla = talla;
		}
		
}

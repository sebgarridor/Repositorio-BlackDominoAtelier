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
import lombok.ToString;

@Entity
@Table(name="regiones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Region {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private Long id;

		private String region;

		@JsonIgnore
		@OneToMany(mappedBy = "region", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
		private List<Comuna> comuna;
		
		
	
}

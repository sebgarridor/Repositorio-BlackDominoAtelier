package cl.blackdomino.web.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="ventas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	private String tipoVenta;
	
	private String regionEnvio;
	
	private Integer costoEnvio;
	
	private Integer IVA;
	
	private Integer totalVenta;
	
	
}

	package cl.blackdomino.web.models;
	
	import java.util.List;
	
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.JoinTable;
	import javax.persistence.ManyToMany;
	import javax.persistence.ManyToOne;
	import javax.persistence.OneToOne;
	import javax.persistence.Table;
	
	
	import com.fasterxml.jackson.annotation.JsonIgnore;

	
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
	
	private Integer costoEnvio;
	
	private Integer iva;
	
	private Integer totalVenta;
	

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dte_id")
	private DTE dte;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="mediopago_id")
	private MedioPago mediopago;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="estado_id")
	private Estado estado;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="envio_id")
	private Envio envio;

	//ManyToMany
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name="productos_ventas",
			joinColumns = @JoinColumn(name="venta_id"),
			inverseJoinColumns = @JoinColumn(name="producto_id")
			)
	private List<Producto> productos;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="usuario_id")
	private Usuario usuario;
	
	
}

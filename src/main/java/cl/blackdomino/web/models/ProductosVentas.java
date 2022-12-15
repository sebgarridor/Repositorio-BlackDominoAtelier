	package cl.blackdomino.web.models;
	
	import java.util.Date;
	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.PrePersist;
	import javax.persistence.PreUpdate;
	import javax.persistence.Table;
	
	import org.springframework.format.annotation.DateTimeFormat;
	
	import lombok.AllArgsConstructor;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;
	
	@Entity
	@Table(name="productos_ventas")
	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public class ProductosVentas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Integer cantidadProducto;
	
	private Integer subtotal;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern="yyy-MM-dd")
	private Date createdAt;
	
	
	@DateTimeFormat(pattern="yyy-MM-dd")
	private Date updatedAt;
	
	//1 ManyToOne
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="producto_id")
	private Producto producto;
	
	//2 ManyToOne
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="venta_id")
	private Venta venta;
	
	//atributos de control
	//agrega a la columna la fecha antes de insertar
	@PrePersist
	protected void onCreate(){
	this.createdAt = new Date();
	}
	//fecha en la que se actualiza
	@PreUpdate
	protected void onUpdate(){
	this.updatedAt = new Date();
	}
}

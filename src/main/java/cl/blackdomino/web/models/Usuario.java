package cl.blackdomino.models;

public class Usuario {
	
	private int id;
	private String nombre;
	private String apellido;
	private String correo;
	private int telefono;
	private int direccion_id;
	public Usuario() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getDireccion_id() {
		return direccion_id;
	}
	public void setDireccion_id(int direccion_id) {
		this.direccion_id = direccion_id;
	}
	

}

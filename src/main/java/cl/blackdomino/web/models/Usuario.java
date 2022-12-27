package cl.blackdomino.web.models;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "usuarios", 
    uniqueConstraints = { 
      @UniqueConstraint(columnNames = "correo"),
      @UniqueConstraint(columnNames = "rut") 
    })
public class Usuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  private String nombre;
  
  @NotBlank
  private String apellidos;

  @NotBlank
  private String correo;

  private String password;
  
  @NotBlank
  private String rut;
  
  @NotBlank
  private String telefono;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(  name = "usuarios_roles", 
        joinColumns = @JoinColumn(name = "usuario_id"), 
        inverseJoinColumns = @JoinColumn(name = "rol_id"))
  private Set<Rol> roles = new HashSet<>();
  
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt; //inserción de un registro
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt; //update de un registro
	
	@PrePersist
  protected void onCreate(){
      this.createdAt = new Date();
  }
  @PreUpdate
  protected void onUpdate(){
      this.updatedAt = new Date();
  }

  public Usuario() {
  }



  public Usuario(@NotBlank String nombre, @NotBlank String apellidos,
		@NotBlank @Email String correo, String password,
		@NotBlank String rut, @NotBlank String telefono) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.correo = correo;
	this.password = password;
	this.rut = rut;
	this.telefono = telefono;
}


public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public String getApellidos() {
	return apellidos;
}



public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}



public String getCorreo() {
	return correo;
}



public void setCorreo(String correo) {
	this.correo = correo;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



public String getRut() {
	return rut;
}



public void setRut(String rut) {
	this.rut = rut;
}



public String getTelefono() {
	return telefono;
}



public void setTelefono(String telefono) {
	this.telefono = telefono;
}



public Set<Rol> getRoles() {
	return roles;
}



public void setRoles(Set<Rol> roles) {
	this.roles = roles;
}




}
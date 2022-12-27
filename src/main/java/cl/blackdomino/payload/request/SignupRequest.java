package cl.blackdomino.payload.request;


import java.util.Set;

import javax.validation.constraints.*;



public class SignupRequest {
	
  @NotBlank
  private String nombre;
  
  @NotBlank
  private String apellidos;
  
  @NotBlank
  private String rut;
  
  @NotBlank
  private String telefono;

  @NotBlank
  private String correo;

  private Set<String> roles;

  private String password;
  
  

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

public Set<String> getRol() {
	return roles;
}

public void setRol(Set<String> roles) {
	this.roles = roles;
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
 
}

package cl.blackdomino.payload.response;


import java.util.List;

public class JwtResponse {
  private String token;
  private String type = "Bearer";
  private Long id;
  private String nombre;
  private String apellidos;
  private String correo;
  private List<String> roles;
  
  
public JwtResponse(String accessToken, Long id, String nombre, String apellidos, String correo, List<String> roles) {
	super();
	this.token = accessToken;
	this.id = id;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.correo = correo;
	this.roles = roles;
}


public String getAccessToken() {
	return token;
}


public void setAccessToken(String accessToken) {
	this.token = accessToken;
}


public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
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


public List<String> getRoles() {
	return roles;
}


public void setRoles(List<String> roles) {
	this.roles = roles;
}




}
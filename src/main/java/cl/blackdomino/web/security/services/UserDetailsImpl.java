package cl.blackdomino.web.security.services;



import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import com.fasterxml.jackson.annotation.JsonIgnore;

import cl.blackdomino.web.models.Usuario;



public class UserDetailsImpl implements UserDetails {
  private static final long serialVersionUID = 1L;

  private Long id;
  
  private String nombre;
  
  private String apellidos;

  private String correo;

  @JsonIgnore
  private String password;

  private Collection<? extends GrantedAuthority> authorities;

  public UserDetailsImpl(Long id,String nombre, String apellidos,  String correo, String password,
      Collection<? extends GrantedAuthority> authorities) {
    this.id = id;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.correo = correo;
    this.password = password;
    this.authorities = authorities;
  }

  public static UserDetailsImpl build(Usuario usuario) {
    List<GrantedAuthority> authorities = usuario.getRoles().stream()
        .map(rol -> new SimpleGrantedAuthority(rol.getNombre().name()))
        .collect(Collectors.toList());

    return new UserDetailsImpl(
        usuario.getId(), 
        usuario.getNombre(),
        usuario.getApellidos(),
        usuario.getCorreo(),
        usuario.getPassword(), 
        authorities);
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  public Long getId() {
    return id;
  }
  
  public String getNombre() {
	    return nombre;
	  }
  
  public String getApellidos() {
	    return apellidos;
	  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return correo;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    UserDetailsImpl user = (UserDetailsImpl) o;
    return Objects.equals(id, user.id);
  }
}

package com.example.demo1.models;
 
import javax.persistence.*;
 
@Entity
@Table(name = "usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String email;
    private String telefono;
    private String consulta;

    public void setConsulta(String consulta){
        this.consulta = consulta;
    }
    public String getConsulta(){
        return consulta;
    }

public void setTelefono(String telefono){
    this.telefono = telefono;
}
public String getTelefono(){
    return telefono;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

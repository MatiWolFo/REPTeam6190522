package com.generationg6.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="usuarios")
public class Usuario {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nombre;

    private String apellido;

    private Integer edad;

    private String rut;

    private String email;

    private String username;

    private String password;

@OneToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_rol", referencedColumnName = "id")
private Roles rol;
//Este rol corresponde a "rol" del .jsp


    @Column(updatable = false)
    private Date updatedAt;
    private Date createdAt;

    public Usuario() {
        super();
    }

    public Usuario(Long id, String nombre, String apellido, Integer edad, String rut, String email, String username, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rut = rut;
        this.email = email;
        this.username = username;
        this.password = password;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }

    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}

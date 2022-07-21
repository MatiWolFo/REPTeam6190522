package com.generationg6.models;

/* IMPORTAR LIBRERIAS */

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/* CREAR ENTIDAD */
@Entity
@Table(name = "usuarios")
public class Usuario {

    /* OBJETO Y ATRIBUTO */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String rut;
    private String username;

    @NotNull

    private String password;
    @Transient
    @JsonIgnore
    private String passwordConfirm;

    private String email;
    /* COLUMNAS CREATED N UPDATED */
    @Column(updatable = false)
    @JsonIgnore
    private Date fechaCreacion;

    @JsonIgnore
    private Date fechaEdicion;

    //ManyToMany
    @JsonManagedReference
    @ManyToMany(fetch=FetchType.EAGER)//join
    @JoinTable(
            name="roles_usuarios",
            joinColumns= @JoinColumn(name="usuario_id"),
            inverseJoinColumns=@JoinColumn(name="rol_id")
    )
    private List<Rol> roles;




    /* 1 USUARIO TIENE VARIAS RESPUESTAS DE JUEGOS */
    @JsonIgnore
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    /* LISTA DE VARIOS OBJETOS COLABORATIVOS */
    private List<ScoreUsuario> listaScoreUsuario;

    /* ETAPAUSUARIO */
    @JsonIgnore
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    /* LISTA DE VARIOS OBJETOS COLABORATIVOS */
    private List<EtapaUsuario> listaEtapaUsuario;

    /* CONSTRUCTORES */

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String apellido, Integer edad, String username, String password, String rut, String email, List<ScoreUsuario> listaScoreUsuario, List<EtapaUsuario> listaEtapaUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.username = username;
        this.password = password;
        this.rut = rut;
        this.email = email;


        this.listaScoreUsuario = listaScoreUsuario;
        this.listaEtapaUsuario = listaEtapaUsuario;
    }

    /* GETTERS N SETTERS */

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


    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }
    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }


    public List<ScoreUsuario> getListaScoreUsuario() {
        return listaScoreUsuario;
    }

    public void setListaScoreUsuario(List<ScoreUsuario> listaScoreUsuario) {
        this.listaScoreUsuario = listaScoreUsuario;
    }

    public List<EtapaUsuario> getListaEtapaUsuario() {
        return listaEtapaUsuario;
    }

    public void setListaEtapaUsuario(List<EtapaUsuario> listaEtapaUsuario) {
        this.listaEtapaUsuario = listaEtapaUsuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }



    /* ASIGNA LA FECHA ACTUAL ANTES DE INSERTAR REGISTROS A LA DB */
    @PrePersist
    protected void onCreate() {
        this.fechaCreacion = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.fechaEdicion = new Date();
    }
}

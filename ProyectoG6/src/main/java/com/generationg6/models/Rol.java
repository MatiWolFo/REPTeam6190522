package com.generationg6.models;

/* IMPORTAR LIBRERIAS */

import com.fasterxml.jackson.annotation.*;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/* CREAR ENTIDAD */
@Entity
@Table(name = "roles")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Rol {
    /* OBJETO Y ATRIBUTO */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;
    private String nombre;
    private String descripcion;
    /* COLUMNAS CREATED N UPDATED */
    @JsonIgnore
    @Column(updatable = false)
    private Date fechaCreacion;
    @JsonIgnore
    private Date fechaEdicion;


    //OneToMany
    //1 solo rol para muchos usuarios
    @OneToMany(mappedBy = "roles", cascade = CascadeType.ALL)
    private Set<Usuario> usuarios = new HashSet<>();


    /* CONSTRUCTORES */
    public Rol() {

    }

    public Rol(Long id, String nombre, String descripcion) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;

    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
        for(Usuario usuario: usuarios){
            usuario.setRoles(this);
        }
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

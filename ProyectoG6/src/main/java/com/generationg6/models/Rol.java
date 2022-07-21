package com.generationg6.models;

/* IMPORTAR LIBRERIAS */

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;


import java.util.Date;
import java.util.List;
import javax.persistence.*;

/* CREAR ENTIDAD */
@Entity
@Table(name = "roles")
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

    @JsonBackReference
    @ManyToMany(mappedBy ="roles",fetch=FetchType.LAZY)
    private List<Usuario> usuarios;


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

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
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

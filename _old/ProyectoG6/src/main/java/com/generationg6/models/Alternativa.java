package com.generationg6.models;

/* IMPORTAR LIBRERIAS */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

/* CREAR ENTIDAD */
@JsonIgnoreProperties({"hibernateLazyInitializer"})//ignora las listas y hace qe sean visibles las alternativas en el front
@Entity
@Table(name = "alternativas")
public class Alternativa {

    /* OBJETO Y ATRIBUTO */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    /* COLUMNAS CREATED N UPDATED */
    @Column(updatable = false)
    private Date fechaCreacion;
    private Date fechaEdicion;
    @JsonIgnore /* La lista no regresa al padre, porque si regresa se genera un loop, por lo tanto ignora el regreso hacia el padre*/
    @OneToMany(mappedBy = "alternativa", cascade = CascadeType.ALL)
    /* LISTA DE VARIOS OBJETOS COLABORATIVOS */
    private List<AlternativaPregunta> listaAlternativaPregunta;

    /* CONSTRUCTORES */
    public Alternativa() {
    }

    public Alternativa(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    /* GETTERS N SETTERS */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<AlternativaPregunta> getListaAlternativaPregunta() {
        return listaAlternativaPregunta;
    }

    public void setListaAlternativaPregunta(List<AlternativaPregunta> listaAlternativaPregunta) {
        this.listaAlternativaPregunta = listaAlternativaPregunta;
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
package com.generationg6.models;

/* IMPORTAR LIBRERIAS */

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

/* CREAR ENTIDAD */
@Entity
@Table(name = "preguntas")
public class Pregunta {

    /* OBJETO Y ATRIBUTO */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    /* COLUMNAS CREATED N UPDATED */
    @Column(updatable = false)
    private Date fechaCreacion;
    private Date fechaEdicion;

    /* VARIAS PREGUNTAS TIENEN 1 ETAPA MANY TO ONE */
    @JsonIgnore /*De la lista no regresa al padre (contenido) o sino se genera un loop*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_etapa")
    /* ATRIBUTO FK COLABORATIVO */
    private Etapa etapa;

    /* 1 PREGUNTA TIENE VARIAS RESPUESTAS ONE TO MANY */
    @OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    /* LISTA DE VARIOS OBJETOS COLABORATIVOS */
    private List<AlternativaPregunta> listaAlternativaPregunta;

    /* CONSTRUCTORES */

    public Pregunta() {
    }

    public Pregunta(Long id, String descripcion, Etapa etapa, List<AlternativaPregunta> listaAlternativaPregunta) {
        this.id = id;
        this.descripcion = descripcion;
        this.etapa = etapa;
        this.listaAlternativaPregunta = listaAlternativaPregunta;
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

    public Etapa getEtapa() {
        return etapa;
    }

    public void setEtapa(Etapa etapa) {
        this.etapa = etapa;
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
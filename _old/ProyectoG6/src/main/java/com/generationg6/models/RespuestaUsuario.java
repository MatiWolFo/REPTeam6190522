package com.generationg6.models;

/* IMPORTAR LIBRERIAS */

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

import javax.persistence.*;

/* CREAR ENTIDAD */
@Entity
@Table(name = "respuestas_usuarios")
public class RespuestaUsuario {

    /* OBJETO Y ATRIBUTO */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* COLUMNAS CREATED N UPDATED */
    @Column(updatable = false)
    private Date fechaCreacion;

    /* VARIOS JUEGOS PUEDEN ESTAR EN 1 ETAPA */
    @JsonIgnore /*De la lista no regresa al padre (contenido) o sino se genera un loop*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alternativas_pregunta")
    /* ATRIBUTO FK COLABORATIVO */
    private AlternativaPregunta alternativaPregunta;
    @JsonIgnore /*De la lista no regresa al padre (contenido) o sino se genera un loop*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    /* ATRIBUTO FK COLABORATIVO */
    private Usuario usuario;

    /* CONSTRUCTORES */

    public RespuestaUsuario() {
    }

    public RespuestaUsuario(Long id) {
        this.id = id;
    }

    /* GETTERS & SETTERS */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AlternativaPregunta getAlternativaPregunta() {
        return alternativaPregunta;
    }

    public void setAlternativaPregunta(AlternativaPregunta alternativaPregunta) {
        this.alternativaPregunta = alternativaPregunta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /* ASIGNA LA FECHA ACTUAL ANTES DE INSERTAR REGISTROS A LA DB */
    @PrePersist
    protected void onCreate() {
        this.fechaCreacion = new Date();
    }


}


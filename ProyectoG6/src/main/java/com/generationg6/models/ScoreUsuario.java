package com.generationg6.models;

/* IMPORTAR LIBRERIAS */

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;


import javax.persistence.*;

/* CREAR ENTIDAD */
@Entity
@Table(name = "scores_usuarios")
public class ScoreUsuario {

    /* OBJETO Y ATRIBUTO */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer scoreRealizado;
    private Integer vidasUtilizadas;

    /* COLUMNAS CREATED N UPDATED */
    @Column(updatable = false)
    private Date fechaCreacion;

    /* VARIOS JUEGOS PUEDEN ESTAR EN 1 ETAPA */
    @JsonIgnore /*De la lista no regresa al padre (contenido) o sino se genera un loop*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_juego")
    /* ATRIBUTO FK COLABORATIVO */
    private Juego juego;
    @JsonIgnore /*De la lista no regresa al padre (contenido) o sino se genera un loop*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    /* ATRIBUTO FK COLABORATIVO */
    private Usuario usuario;

    /* CONSTRUCTORES */

    public ScoreUsuario() {
    }

    public ScoreUsuario(Long id, Integer scoreRealizado, Integer vidasUtilizadas) {
        this.id = id;
        this.scoreRealizado = scoreRealizado;
        this.vidasUtilizadas = vidasUtilizadas;
    }

    /* GETTERS & SETTERS */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getScoreRealizado() {
        return scoreRealizado;
    }

    public void setScoreRealizado(Integer scoreRealizado) {
        this.scoreRealizado = scoreRealizado;
    }

    public Integer getVidasUtilizadas() {
        return vidasUtilizadas;
    }

    public void setVidasUtilizadas(Integer vidasUtilizadas) {
        this.vidasUtilizadas = vidasUtilizadas;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
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

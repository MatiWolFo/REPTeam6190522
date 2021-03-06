package com.generationg6.models;

/* IMPORTAR LIBRERIAS */

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

/* CREAR ENTIDAD */
@Entity
@Table(name = "juegos")
public class Juego {

    /* OBJETO Y ATRIBUTO */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    /* COLUMNAS CREATED N UPDATED */
    @Column(updatable = false)
    private Date fechaCreacion;
    private Date fechaEdicion;

    /* VARIOS JUEGOS PUEDEN ESTAR EN 1 ETAPA */
    @JsonIgnore /*De la lista no regresa al padre (contenido) o sino se genera un loop*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_etapa")
    /* ATRIBUTO FK COLABORATIVO */
    private Etapa etapa;

    /* 1 JUEGO TIENE VARIAS REGLAS */
    @OneToMany(mappedBy = "juego", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    /* LISTA DE VARIOS OBJETOS COLABORATIVOS */
    private List<ConfiguracionJuego> listaConfiguracionJuego;

    /* 1 JUEGO TIENE VARIOS SCORES */
    @OneToMany(mappedBy = "juego", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    /* LISTA DE VARIOS OBJETOS COLABORATIVOS */
    private List<ScoreUsuario> listaScoreUsuario;

    /* CONSTRUCTORES */
    public Juego() {
        super();
    }

    public Juego(Long id, String nombre, String descripcion) {
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

    public List<ConfiguracionJuego> getListaConfiguracionJuego() {
        return listaConfiguracionJuego;
    }

    public void setListaConfiguracionJuego(List<ConfiguracionJuego> listaConfiguracionJuego) {
        this.listaConfiguracionJuego = listaConfiguracionJuego;
    }

    public List<ScoreUsuario> getListaScoreUsuario() {
        return listaScoreUsuario;
    }

    public void setListaScoreUsuario(List<ScoreUsuario> listaScoreUsuario) {
        this.listaScoreUsuario = listaScoreUsuario;
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

    public Etapa getEtapa() {
        return etapa;
    }

    public void setEtapa(Etapa etapa) {
        this.etapa = etapa;
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

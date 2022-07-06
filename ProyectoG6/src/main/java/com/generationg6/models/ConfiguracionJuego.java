package com.generationg6.models;

/* IMPORTAR LIBRERIAS */

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

/* CREAR ENTIDAD */
@Entity
@Table(name = "configuraciones_juegos")
public class ConfiguracionJuego {

    /* OBJETO Y ATRIBUTO */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer vidas;
    private Integer scoreMinimo;

    /* VARIOS JUEGOS PUEDEN ESTAR EN 1 ETAPA */
    @JsonIgnore /*De la lista no regresa al padre (contenido) o sino se genera un loop*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_juego")
    /* ATRIBUTO FK COLABORATIVO */
    private Juego juego;

    /* CONSTRUCTORES */

    public ConfiguracionJuego() {
    }
    public ConfiguracionJuego(Long id, Integer vidas, Integer scoreMinimo) {
        this.id = id;
        this.vidas = vidas;
        this.scoreMinimo = scoreMinimo;
    }

    /* GETTERS & SETTERS */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVidas() {
        return vidas;
    }

    public void setVidas(Integer vidas) {
        this.vidas = vidas;
    }

    public Integer getScoreMinimo() {
        return scoreMinimo;
    }

    public void setScoreMinimo(Integer scoreMinimo) {
        this.scoreMinimo = scoreMinimo;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }


}

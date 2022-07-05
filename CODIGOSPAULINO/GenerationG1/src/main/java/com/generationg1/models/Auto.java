package com.generationg1.models;

import javax.persistence.*;

@Entity
@Table(name="autos")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //variables
    private String marca;
    private String nombre;
    private int velocidad;

    //constructor vacio
    public Auto() {
    }

    //constructor con parametros

    public Auto(Long id, String marca, String nombre, int velocidad) {
        this.id = id;
        this.marca = marca;
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    //getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}

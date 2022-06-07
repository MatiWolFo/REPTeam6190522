package com.generation.f20220527;

public class Auto {
    //clase es un modelo o prototipo en cual a partir
    //de el sea crea un objeto, nace a partir de la clase,
    //caracteristica o atributo
    //algo concreto  lo convierte en abstracto

    //atributo
    //constructores
    //accesadores y mutadores (get y set)
    //metodos o funciones


    //atributo

    private String color;
    private String modelo;
    private String marca;
    private Double velocidad;



    //constructor vacio

    public Auto(){
        super();

    }

    public Auto(String color, String marca, String modelo, Double velocidad ) {
        super();
        this.color = color;
        this.marca =marca;
        this.modelo =modelo;
        this.velocidad = velocidad;
    }
    //accesadores/mutadores get y set

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }


    //metodos o funciones personalizadas

    public void Aumentarvelocidad(){
        this.velocidad =  10d;


    }






}

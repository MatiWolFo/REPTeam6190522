package com.generationg6.models;
/*CREATE TABLE juegosDnD(
id_juego_DnD int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_juego varchar(50),
descripcion_juego varchar(100),
id_validacion_respuesta_juego int
);
*/

public class Juegos {
private int id_juego_DnD;
private String nombre_juego;
private String descripcion_juego;
private int id_validacion_respuesta_juego;

    public Juegos() {
        super();
    }

    public Juegos(int id_juego_DnD, String nombre_juego, String descripcion_juego, int id_validacion_respuesta_juego) {
        super();
        this.id_juego_DnD = id_juego_DnD;
        this.nombre_juego = nombre_juego;
        this.descripcion_juego = descripcion_juego;
        this.id_validacion_respuesta_juego = id_validacion_respuesta_juego;
    }

    public int getId_juego_DnD() {
        return id_juego_DnD;
    }

    public void setId_juego_DnD(int id_juego_DnD) {
        this.id_juego_DnD = id_juego_DnD;
    }

    public String getNombre_juego() {
        return nombre_juego;
    }

    public void setNombre_juego(String nombre_juego) {
        this.nombre_juego = nombre_juego;
    }

    public String getDescripcion_juego() {
        return descripcion_juego;
    }

    public void setDescripcion_juego(String descripcion_juego) {
        this.descripcion_juego = descripcion_juego;
    }

    public int getId_validacion_respuesta_juego() {
        return id_validacion_respuesta_juego;
    }

    public void setId_validacion_respuesta_juego(int id_validacion_respuesta_juego) {
        this.id_validacion_respuesta_juego = id_validacion_respuesta_juego;
    }

}

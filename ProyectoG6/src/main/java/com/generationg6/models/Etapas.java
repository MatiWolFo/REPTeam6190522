package com.generationg6.models;
/*
CREATE TABLE etapas(
id_etapa int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_etapa varchar(50),
descripcion_etapa varchar(100),
id_contenido int,
id_validacion_respuesta_etapa int
); */

public class Etapas {
    private int id_etapas;
    private String nombre_etapa;
    private String descripcion_etapa;
    private int id_contenido;
    private int id_validacion_respuesta_etapa;

    public Etapas() {
        super();
    }

<<<<<<< HEAD
    public Etapas(int id_etapas, String nombre_etapa, String descripcion_etapa, int id_contenido,
                  int id_validacion_respuesta_etapa) {
        super();

    }

    public int getId_etapas() {
        return id_etapas;
    }

    public void setId_etapas(int id_etapas) {
        this.id_etapas = id_etapas;
    }

    public String getNombre_etapa() {
        return nombre_etapa;
    }

    public void setNombre_etapa(String nombre_etapa) {
        this.nombre_etapa = nombre_etapa;
    }

    public String getDescripcion_etapa() {
        return descripcion_etapa;
    }

    public void setDescripcion_etapa(String descripcion_etapa) {
        this.descripcion_etapa = descripcion_etapa;
    }

    public int getId_contenido() {
        return id_contenido;
    }

    public void setId_contenido(int id_contenido) {
        this.id_contenido = id_contenido;
    }

    public int getId_validacion_respuesta_etapa() {
        return id_validacion_respuesta_etapa;
    }

    public void setId_validacion_respuesta_etapa(int id_validacion_respuesta_etapa) {
        this.id_validacion_respuesta_etapa = id_validacion_respuesta_etapa;
    }
=======
public Etapas() {
	super();
}

public Etapas(int id_etapas, String nombre_etapa, String descripcion_etapa, int id_contenido,
		int id_validacion_respuesta_etapa) {
	super();
	this.id_etapas = id_etapas;
	this.nombre_etapa = nombre_etapa;
	this.descripcion_etapa = descripcion_etapa;
	this.id_contenido = id_contenido;
	this.id_validacion_respuesta_etapa = id_validacion_respuesta_etapa;
}
public int getId_etapas() {
	return id_etapas;
}
public void setId_etapas(int id_etapas) {
	this.id_etapas = id_etapas;
}
public String getNombre_etapa() {
	return nombre_etapa;
}
public void setNombre_etapa(String nombre_etapa) {
	this.nombre_etapa = nombre_etapa;
}
public String getDescripcion_etapa() {
	return descripcion_etapa;
}
public void setDescripcion_etapa(String descripcion_etapa) {
	this.descripcion_etapa = descripcion_etapa;
}
public int getId_contenido() {
	return id_contenido;
}
public void setId_contenido(int id_contenido) {
	this.id_contenido = id_contenido;
}
public int getId_validacion_respuesta_etapa() {
	return id_validacion_respuesta_etapa;
}
public void setId_validacion_respuesta_etapa(int id_validacion_respuesta_etapa) {
	this.id_validacion_respuesta_etapa = id_validacion_respuesta_etapa;
>>>>>>> Diana7riachuelos
}





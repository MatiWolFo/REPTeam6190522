package com.generationg6.models;

/*CREATE TABLE contenidos(
id_contenido int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_contenido varchar(50),
descripcion varchar(50),
id_modulo int
);*/

public class preguntas_etapas {
private int id_contenido;
private String nombre_contenido;
private String descripcion;
private int id_modulo;

public preguntas_etapas() {
	super();
}

public preguntas_etapas(int id_contenido, String nombre_contenido, String descripcion, int id_modulo) {
	super();
	this.id_contenido = id_contenido;
	this.nombre_contenido = nombre_contenido;
	this.descripcion = descripcion;
	this.id_modulo = id_modulo;
}

public int getId_contenido() {
	return id_contenido;
}
public void setId_contenido(int id_contenido) {
	this.id_contenido = id_contenido;
}
public String getNombre_contenido() {
	return nombre_contenido;
}
public void setNombre_contenido(String nombre_contenido) {
	this.nombre_contenido = nombre_contenido;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public int getId_modulo() {
	return id_modulo;
}
public void setId_modulo(int id_modulo) {
	this.id_modulo = id_modulo;
}
}
package com.generationg6.models;
/*CREATE TABLE etapas(
id_etapas int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_etapa varchar(50),
descripcion varchar(50),
id_contenido int,
id_pregunta_etapa int,
id_usuario int
);*/

public class Etapas {

private int id_etapas;
private String nombre_etapa;
private String descripcion;
private int id_contenido;
private int id_pregunta_etapa;
private int id_usuario;

public Etapas() {
	super();
}

public Etapas (int id_etapas, String nombre_etapa, String descripcion, int id_contenido, int id_pregunta_etapa, int id_usuario) {
super();
this.id_etapas = id_etapas;
this.nombre_etapa = nombre_etapa;
this.descripcion = descripcion;
this.id_contenido= id_contenido;
this.id_pregunta_etapa= id_pregunta_etapa;
this.id_usuario= id_usuario;
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
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}	
public int getId_contenido() {
	return id_contenido;
}
public void setId_contenido(int id_contenido) {
	this.id_contenido = id_contenido;
}
public int getId_pregunta_etapa() {
	return id_pregunta_etapa;
}
public void setId_pregunta_etapa(int id_pregunta_etapa) {
	this.id_pregunta_etapa = id_pregunta_etapa;
}
public int getId_usuario() {
	return id_usuario;
}
public void setId_usuario(int id_usuario) {
	this.id_usuario = id_usuario;
}



}



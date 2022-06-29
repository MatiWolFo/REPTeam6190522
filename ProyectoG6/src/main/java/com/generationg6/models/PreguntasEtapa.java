package com.generationg6.models;

/*
CREATE TABLE PreguntasEtapa(
id_pregunta_etapa int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_pregunta_etapa varchar(50),
descripcion_pregunta_etapa varchar(100)
);*/

import java.util.List;

public class PreguntasEtapa {
private int id_pregunta_etapa;
private String nombre_pregunta_etapa;
private String descripcion_pregunta_etapa;

private List<ValidacionRespuestasEtapa> listaValidacionRespuestaEtapa;

public PreguntasEtapa() {
	super();
}

public PreguntasEtapa(int id_pregunta_etapa, String nombre_pregunta_etapa, String descripcion_pregunta_etapa,
					  int id_modulo) {
	super();
	this.id_pregunta_etapa = id_pregunta_etapa;
	this.nombre_pregunta_etapa = nombre_pregunta_etapa;
	this.descripcion_pregunta_etapa = descripcion_pregunta_etapa;

}

public int getId_pregunta_etapa() {
	return id_pregunta_etapa;
}
public void setId_pregunta_etapa(int id_pregunta_etapa) {
	this.id_pregunta_etapa = id_pregunta_etapa;
}
public String getNombre_pregunta_etapa() {
	return nombre_pregunta_etapa;
}
public void setNombre_pregunta_etapa(String nombre_pregunta_etapa) {
	this.nombre_pregunta_etapa = nombre_pregunta_etapa;
}
public String getDescripcion_pregunta_etapa() {
	return descripcion_pregunta_etapa;
}
public void setDescripcion_pregunta_etapa(String descripcion_pregunta_etapa) {
	this.descripcion_pregunta_etapa = descripcion_pregunta_etapa;
}

	public List<ValidacionRespuestasEtapa> getListaValidacionRespuestaEtapa() {
		return listaValidacionRespuestaEtapa;
	}

	public void setListaValidacionRespuestaEtapa(List<ValidacionRespuestasEtapa> listaValidacionRespuestaEtapa) {
		this.listaValidacionRespuestaEtapa = listaValidacionRespuestaEtapa;
	}
}
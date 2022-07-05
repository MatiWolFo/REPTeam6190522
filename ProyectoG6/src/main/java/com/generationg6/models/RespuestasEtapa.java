package com.generationg6.models;
/*
CREATE TABLE respuestasEtapas(
id_respuesta_etapa int PRIMARY KEY NOT NULL AUTO_INCREMENT,
descripcion_respuesta_etapa varchar(100)
);
*/

public class RespuestasEtapa {

	private int id_respuestas_etapa;
	private String descripcion_respuesta_etapa;

	public RespuestasEtapa() {
		super();
	}

	
	public RespuestasEtapa(int id_respuestas_etapa, String descripcion_respuesta_etapa) {
		super();
		this.id_respuestas_etapa = id_respuestas_etapa;
		this.descripcion_respuesta_etapa = descripcion_respuesta_etapa;
	}
	
	public int getId_respuestas_etapa() {
		return id_respuestas_etapa;
	}
	public void setId_respuestas_etapa(int id_respuestas_etapa) {
		this.id_respuestas_etapa = id_respuestas_etapa;
	}
	public String getDescripcion_respuesta_etapa() {
		return descripcion_respuesta_etapa;
	}
	public void setDescripcion_respuesta_etapa(String descripcion_respuesta_etapa) {
		this.descripcion_respuesta_etapa = descripcion_respuesta_etapa;
	}

}
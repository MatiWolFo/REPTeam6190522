package com.generationg6.models;
/*

CREATE TABLE preguntasJuegos(
id_pregunta_juego int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_pregunta_juego varchar(50),
descripcion_pregunta_juego varchar(100)
);
*/

public class preguntas_juego {

	private int id_preguntas_juego;
	private String nombre_pregunta_juego;
	private String descripcion_pregunta_juego;

	public preguntas_juego() {
		super();
	}

	public preguntas_juego(int id_preguntas_juego, String nombre_pregunta_juego, String descripcion_pregunta_juego) {
		super();
		this.id_preguntas_juego = id_preguntas_juego;
		this.nombre_pregunta_juego = nombre_pregunta_juego;
		this.descripcion_pregunta_juego = descripcion_pregunta_juego;
	}
	
	public int getId_preguntas_juego() {
		return id_preguntas_juego;
	}
	public void setId_preguntas_juego(int id_preguntas_juego) {
		this.id_preguntas_juego = id_preguntas_juego;
	}
	public String getNombre_pregunta_juego() {
		return nombre_pregunta_juego;
	}
	public void setNombre_pregunta_juego(String nombre_pregunta_juego) {
		this.nombre_pregunta_juego = nombre_pregunta_juego;
	}
	public String getDescripcion_pregunta_juego() {
		return descripcion_pregunta_juego;
	}
	public void setDescripcion_pregunta_juego(String descripcion_pregunta_juego) {
		this.descripcion_pregunta_juego = descripcion_pregunta_juego;
	}

}

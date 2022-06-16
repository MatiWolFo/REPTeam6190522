package com.generationg6.models;
/*CREATE TABLE preguntas_juego(
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
descripcion varchar(50),
id_respuesta_juego int,
id_validacion int
);*/

public class preguntas_juego {

	private int id_preguntas_juego;
	private String descripcion;
	private int id_respuestas_juego;
	private int id_validacion;
	
	public preguntas_juego(int id_preguntas_juego, String descripcion, int id_respuestas_juego, int id_validacion) {
		super();
		this.id_preguntas_juego = id_preguntas_juego;
		this.descripcion = descripcion;
		this.id_respuestas_juego = id_respuestas_juego;
		this.id_validacion = id_validacion;
	}

	public int getId_preguntas_juego() {
		return id_preguntas_juego;
	}

	public void setId_preguntas_juego(int id_preguntas_juego) {
		this.id_preguntas_juego = id_preguntas_juego;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId_respuestas_juego() {
		return id_respuestas_juego;
	}

	public void setId_respuestas_juego(int id_respuestas_juego) {
		this.id_respuestas_juego = id_respuestas_juego;
	}

	public int getId_validacion() {
		return id_validacion;
	}

	public void setId_validacion(int id_validacion) {
		this.id_validacion = id_validacion;
	}
	

}

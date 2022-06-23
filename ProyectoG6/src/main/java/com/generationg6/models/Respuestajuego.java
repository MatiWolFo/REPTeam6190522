package com.generationg6.models;
/*
CREATE TABLE respuestasJuegos(
id_respuesta_juego int PRIMARY KEY NOT NULL AUTO_INCREMENT,
descripcion_respuesta_juego varchar(100)
);

 */
public class Respuestajuego {
	private int id_respuesta_juego;
	private String descripcion_respuesta_juego;
	
	public Respuestajuego() {
		super();
	}


	public Respuestajuego(int id_respuesta_juego, String descripcion_respuesta_juego) {
		super();
		this.id_respuesta_juego = id_respuesta_juego;
		this.descripcion_respuesta_juego = descripcion_respuesta_juego;
	}
	
	public int getId_respuesta_juego() {
		return id_respuesta_juego;
	}
	public void setId_respuesta_juego(int id_respuesta_juego) {
		this.id_respuesta_juego = id_respuesta_juego;
	}
	public String getDescripcion_respuesta_juego() {
		return descripcion_respuesta_juego;
	}
	public void setDescripcion_respuesta_juego(String descripcion_respuesta_juego) {
		this.descripcion_respuesta_juego = descripcion_respuesta_juego;
	}
	
	
}

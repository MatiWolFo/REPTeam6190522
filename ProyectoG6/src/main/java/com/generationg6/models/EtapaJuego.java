package com.generationg6.models;

/*CREATE TABLE  EtapaJuego(
id_etapa_juego int PRIMARY KEY NOT NULL AUTO_INCREMENT,
id_etapas int,
id_juego int
);*/

public class EtapaJuego {

	private int id_etapa_juego;
	private int id_etapas;
	private int id_juego;

	public EtapaJuego() {
		super();
	}

	
	public EtapaJuego(int id_etapa_juego, int id_etapas, int id_juego) {
		super();

		this.id_etapa_juego = id_etapa_juego;
		this.id_etapas = id_etapas;
		this.id_juego = id_juego;
	}

	public int getId_etapa_juego() {
		return id_etapa_juego;
	}
	public void setId_etapa_juego(int id_etapa_juego) {
		this.id_etapa_juego = id_etapa_juego;
	}
	
	public int getId_etapa() {
		return id_etapas;
	}
	public void setId_etapa(int id_etapa) {
		this.id_etapas = id_etapa;
	}
	
	public int getId_juego() {
		return id_juego;
	}
	public void setId_juego(int id_juego) {
		this.id_juego = id_juego;
	}
	
	}


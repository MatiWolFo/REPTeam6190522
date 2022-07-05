package com.generationg6.models;
/*
 * CREATE TABLE  EtapaUsuario(
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
id_etapas int,
id_usuario int
); */
 

public class EtapaUsuario {
	private int id_etapausuario;
	private int id_etapa;
	private int id_usuario;
	public EtapaUsuario(int id_etapausuario, int id_etapa, int id_usuario) {
		super();
		this.id_etapausuario = id_etapausuario;
		this.id_etapa = id_etapa;
		this.id_usuario = id_usuario;
	}
	public int getId_etapausuario() {
		return id_etapausuario;
	}
	public void setId_etapausuario(int id_etapausuario) {
		this.id_etapausuario = id_etapausuario;
	}
	public int getId_etapa() {
		return id_etapa;
	}
	public void setId_etapa(int id_etapa) {
		this.id_etapa = id_etapa;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

}

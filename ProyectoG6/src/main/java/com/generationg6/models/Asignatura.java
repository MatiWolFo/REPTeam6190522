package com.generationg6.models;
/*CREATE TABLE asignaturas(
id_asignatura int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_asignatura varchar(50),
id_modulo int,
id_usuario int
);*/

public class Asignatura {

	private int id_asignatura;
	private String nombre_asignatura;
	private int id_modulo;
	private int id_usuario;
	
	public Asignatura() {

		super();
	}
	
	public Asignatura(int id_asignatura, String nombre_asignatura, int id_modulo, int id_usuario) {
	super();
	
		this.id_asignatura= id_asignatura;
		this.nombre_asignatura= nombre_asignatura;
		this.id_modulo= id_modulo;
		this.id_usuario= id_usuario;
		
	}

	public int getId_asignatura() {
		return id_asignatura;
	}
	public void setId_asignatura(int id_asignatura) {
		this.id_asignatura = id_asignatura;
	}
	public String getNombre_asignatura() {
		return nombre_asignatura;
	}
	public void setNombre_asignatura(String nombre_asignatura) {
		this.nombre_asignatura = nombre_asignatura;
	}
	public int getId_modulo() {
		return id_modulo;
	}
	public void setId_modulo(int id_modulo) {
		this.id_modulo = id_modulo;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
}

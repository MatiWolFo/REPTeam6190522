package com.generationg6.models;
/*CREATE TABLE modulos(
		id_modulo int PRIMARY KEY NOT NULL AUTO_INCREMENT,
		nombre_modulo varchar(50),
		descripcion_modulo varchar(50),
		id_asignatura int
		);
*/

public class Modulos {
private int id_modulo;
private String nombre_modulo;
private String descripcion_modulo;
private int id_asignatura;

public Modulos() {
	super();
}
public Modulos(int id_modulo, String nombre_modulo, String descripcion_modulo, int id_asignatura) {
	super();
	this.id_modulo = id_modulo;
	this.nombre_modulo = nombre_modulo;
	this.descripcion_modulo = descripcion_modulo;
	this.id_asignatura = id_asignatura;

}

public int getId_modulo() {
	return id_modulo;
}
public void setId_modulo(int id_modulo) {
	this.id_modulo = id_modulo;
}
public String getNombre_modulo() {
	return nombre_modulo;
}
public void setNombre_modulo(String nombre_modulo) {
	this.nombre_modulo = nombre_modulo;
}
public String getDescripcion_modulo() {
	return descripcion_modulo;
}
public void setDescripcion_modulo(String descripcion_modulo) {
	this.descripcion_modulo = descripcion_modulo;
}
public int getId_asignatura() {
	return id_asignatura;
}
public void setId_asignatura(int id_asignatura) {
	this.id_asignatura = id_asignatura;
}

	
}

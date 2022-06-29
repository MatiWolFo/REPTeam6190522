package com.generationg6.models;
/* CREATE TABLE asignaturas(
id_asignatura int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_asignatura varchar(50),
descripcion_asignatura varchar(100)
); */

import java.util.ArrayList;
import java.util.List;

public class Asignatura {

	private int id_asignatura;
	private String nombre_asignatura;
	private String descripcion_asignatura;

	private List<Modulos> listaModulos;

	public Asignatura() {
		super();
	}
	public Asignatura(int id_asignatura, String nombre_asignatura, String descripcion_asignatura) {
		super();
		this.id_asignatura = id_asignatura;
		this.nombre_asignatura = nombre_asignatura;
		this.descripcion_asignatura = descripcion_asignatura;
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

	public String getDescripcion_asignatura() {
		return descripcion_asignatura;
	}

	public void setDescripcion_asignatura(String descripcion_asignatura) {
		this.descripcion_asignatura = descripcion_asignatura;
	}

	public List<Modulos> getListaModulos() {
		return listaModulos;
	}

	public void setListaModulos(List<Modulos> listaModulos) {
		this.listaModulos = listaModulos;
	}
}
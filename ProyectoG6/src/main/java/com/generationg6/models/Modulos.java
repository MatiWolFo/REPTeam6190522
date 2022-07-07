package com.generationg6.models;

public class Modulos {
	private int id_modulo;
	private String nombre_modulo;
	private String descripcion;
	private int id_contenido;
	
	public Modulos(){
		super();
	}
	
	public Modulos(int id_modulo, String nombre_modulo, String descripcion, int id_contenido) {
		super();
		
		this.id_modulo= id_modulo;
		this.nombre_modulo = nombre_modulo;
		this.descripcion = descripcion;
		this.id_contenido = id_contenido; 
	
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
}	
	public int id_contenido() {
		return id_contenido;
	}
	public void setId_contenido(int id_contenido) {
		this.id_contenido = id_contenido;
}
}

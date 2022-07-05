package com.generationg6.models;

/*CREATE TABLE contenidos(
id_contenido int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_contenido varchar(50),
descripcion_contenido varchar(100),
id_modulo int
);*/

public class Contenido {
	private int id_contenido;
	private String nombre_contenido;
	private String descripcion_contenido;
	private int id_modulo;
	
	public Contenido() {
		super();
	}
	
	public Contenido(int id_contenido, String nombre_contenido, String descripcion_contenido, int id_modulo) {
		super();
		this.id_contenido = id_contenido; 
		this.nombre_contenido = nombre_contenido;
		this.descripcion_contenido = descripcion_contenido;
		this.id_modulo= id_modulo;
	}
		
		public int id_contenido() {
			return id_contenido;
		}
		public void setId_contenido(int id_contenido) {
			this.id_contenido = id_contenido;
		}
		public String getNombre_contenido() {
			return nombre_contenido;
		}
		public void setNombre_contenido(String nombre_contenido) {
			this.nombre_contenido = nombre_contenido;
		}
		public String getDescripcion_contenido() {
			return descripcion_contenido;
		}
		public void setDescripcion_contenido(String descripcion_contenido) {
			this.descripcion_contenido = descripcion_contenido;
		}	

		public int getId_modulo() {
			return id_modulo;
		}
		public void setId_modulo(int id_modulo) {
			this.id_modulo = id_modulo;
		}

	}
	


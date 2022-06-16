package com.generationg6.models;
/*CREATE TABLE  roles(
		id_roles int PRIMARY KEY NOT NULL AUTO_INCREMENT,
		nombre_rol varchar(30),
		descripcion varchar(50)
		);*/
		
public class Roles {
	
	private int id_roles;
	private String nombre_modulo;
	private String descripcion;
	 

	public Roles() {
		super();
	}

	
	public Roles(int id_roles, String nombre_modulo, String descripcion) {
		super();

		this.id_roles = id_roles;
		this.nombre_modulo = nombre_modulo;
		this.descripcion = descripcion;
	}

	public int getId_roles() {
		return id_roles;
	}
	public void setId_roles(int id_roles) {
		this.id_roles = id_roles;
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
		this.descripcion= descripcion;
}
}
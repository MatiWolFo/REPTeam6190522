package com.generationg6.models;
/*

CREATE TABLE usuarios(
id_usuario int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre varchar(30),
apellido varchar(30),
edad int,
rut varchar(30),
email varchar(30),
username varchar(30),
password varchar(30),
id_rol_usuario int
);
*/
public class Usuarios {
	private int id_usuario;
	private String nombre;
	private String apellido;
	private int edad;
	private String email;
	private String nombreusuario;
	private String password; 
	private int id_rol_usuario;

	public Usuarios() {
		super();
	}

	public Usuarios(int id_usuario, String nombre, String apellido, int edad, String email, String nombreusuario,
			String password, int id_rol_usuario) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.email = email;
		this.nombreusuario = nombreusuario;
		this.password = password;
		this.id_rol_usuario = id_rol_usuario;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombreusuario() {
		return nombreusuario;
	}
	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId_rol_usuario() {
		return id_rol_usuario;
	}
	public void setId_rol_usuario(int id_rol_usuario) {
		this.id_rol_usuario = id_rol_usuario;
	}

}
	

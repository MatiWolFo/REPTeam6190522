package com.generationg6.models;
/*
CREATE TABLE rolesUsuarios(
id_rol_usuario int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_rol varchar(30),
descripcion_rol varchar(100)
); */
public class Roles {
    private int id_rol_usuario;
    private String nombre_rol;
    private String descripcion_rol;

    public Roles() {
		super();
	}

    public Roles(int id_rol_usuario, String nombre_rol, String descripcion_rol) {
        super();
        this.id_rol_usuario = id_rol_usuario;
        this.nombre_rol = nombre_rol;
        this.descripcion_rol = descripcion_rol;
    }

    public int getId_rol_usuario() {
        return id_rol_usuario;
    }

    public void setId_rol_usuario(int id_rol_usuario) {
        this.id_rol_usuario = id_rol_usuario;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public String getDescripcion_rol() {
        return descripcion_rol;
    }

    public void setDescripcion_rol(String descripcion_rol) {
        this.descripcion_rol = descripcion_rol;
    }

	
}
package com.generationg6.models;
<<<<<<< HEAD
/*CREATE TABLE asignaturas(
id_asignatura int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_asignatura varchar(50),
id_modulo int,
id_usuario int
);*/
=======
>>>>>>> 8965fd0905a909c8a14eeef2be3b63ba9458bf46

/* IMPORTAR LIBRERIAS */

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

/* CREAR ENTIDAD */
@Entity
@Table(name = "asignaturas")
public class Asignatura {

<<<<<<< HEAD
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
=======
    /* OBJETO Y ATRIBUTO */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    /* COLUMNAS CREATED N UPDATED */
    @Column(updatable = false)
    private Date fechaCreacion;
    private Date fechaEdicion;

    /* 1 ASIGNATURA TIENE VARIOS MODULOS ONE TO MANY */
    @OneToMany(mappedBy = "asignatura", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    /* LISTA DE VARIOS OBJETOS COLABORATIVOS */
    private List<Modulo> listaModulos;

    /* CONSTRUCTORES */
    public Asignatura() {
        super();
    }

    public Asignatura(Long id, String nombre, String descripcion) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /* GETTERS N SETTERS */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Modulo> getListaModulos() {
        return listaModulos;
    }

    public void setListaModulos(List<Modulo> listaModulos) {
        this.listaModulos = listaModulos;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    /* ASIGNA LA FECHA ACTUAL ANTES DE INSERTAR REGISTROS A LA DB */
    @PrePersist
    protected void onCreate() {
        this.fechaCreacion = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.fechaEdicion = new Date();
    }

}
>>>>>>> 8965fd0905a909c8a14eeef2be3b63ba9458bf46

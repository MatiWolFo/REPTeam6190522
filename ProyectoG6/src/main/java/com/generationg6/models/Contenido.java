package com.generationg6.models;

<<<<<<< HEAD
/*CREATE TABLE contenidos(
id_contenido int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_contenido varchar(50),
descripcion varchar(50),
id_modulo int
);*/
=======
/* IMPORTAR LIBRERIAS */
>>>>>>> 8965fd0905a909c8a14eeef2be3b63ba9458bf46

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

/* CREAR ENTIDAD */
@Entity
@Table(name = "contenidos")
public class Contenido {
<<<<<<< HEAD
	private int id_contenido;
	private String nombre_contenido;
	private String descripcion;
	private int id_modulo;
	
	public Contenido() {
		super();
	}
	
	public Contenido(int id_contenido, String nombre_contenido, String descripcion, int id_modulo) {
		super();
		this.id_contenido = id_contenido; 
		this.nombre_contenido = nombre_contenido;
		this.descripcion = descripcion;
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
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}	
=======
>>>>>>> 8965fd0905a909c8a14eeef2be3b63ba9458bf46

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

    /* 1 CONTENIDO TIENE VARIAS ETAPAS ONE TO MANY */
    @OneToMany(mappedBy = "contenido", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    /* LISTA DE VARIOS OBJETOS COLABORATIVOS */
    private List<Etapa> listaEtapas;

    /* VARIAS CONTENIDOS TIENEN 1 MODULO MANY TO ONE */
    @JsonIgnore /*De la lista no regresa al padre (modulo) o sino se genera un loop*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_modulo")
    /* ATRIBUTO FK COLABORATIVO */
    private Modulo modulo;

    /* CONSTRUCTORES */
    public Contenido() {
        super();
    }

    public Contenido(Long id, String nombre, String descripcion) {
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

    public List<Etapa> getListaEtapas() {
        return listaEtapas;
    }

    public void setListaEtapas(List<Etapa> listaEtapas) {
        this.listaEtapas = listaEtapas;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
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
	


package com.generationg6.models;

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

/* CREAR ENTIDAD */
@Entity
@Table(name = "modulos")
public class Modulo {

	/* OBJETO Y ATRIBUTO */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String descripcion;
	/* COLUMNAS CREATED N UPDATED */
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;

	/* 1 MODULO TIENE VARIOS CONTENIDOS ONE TO MANY */
	@OneToMany(mappedBy = "modulo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	/* LISTA DE VARIOS OBJETOS COLABORATIVOS */
	private List<Contenido> listaContenidos;

	/* VARIOS MODULOS TIENEN 1 ASIGNATURA MANY TO ONE */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "asignatura_id")
	/* ATRIBUTO FK COLABORATIVO */
	private Asignatura asignatura;

	/* CONSTRUCTORES */
	public Modulo() {
		super();
	}

	public Modulo(Long id, String nombre, String descripcion, List<Contenido> listaContenidos, Asignatura asignatura) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.listaContenidos = listaContenidos;
		this.asignatura = asignatura;
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

	public List<Contenido> getListaContenidos() {
		return listaContenidos;
	}

	public void setListaContenidos(List<Contenido> listaContenidos) {
		this.listaContenidos = listaContenidos;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	/* ASIGNA LA FECHA ACTUAL ANTES DE INSERTAR REGISTROS A LA DB */
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
}

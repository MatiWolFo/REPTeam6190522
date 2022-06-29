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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

/* CREAR ENTIDAD */
@Entity
@Table(name = "juegos")
public class Juego {

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
	
	/* MANYTOMANY ETAPAJUEGO */
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			/* EL NOMBRE ENTITY DE LA INTERTABLE */
			name = "etapas_juegos",
			/* DESDE LA ENTIDAD O TABLA PRESENTE */
			joinColumns = @JoinColumn(name = "juego_id"),
			/* HACIA LA OTRA ENTIDAD O TABLA */
			inverseJoinColumns = @JoinColumn(name = "etapa_id"))
	/* COMO ATRIBUTO DE COLABORACION LA CLASE INVERSEJOIN */
	private List<Etapa> etapas;
	
	/* 1 JUEGO TIENE VARIAS PREGUNTAS ONE TO MANY */
	@OneToMany(mappedBy = "juego", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	/* LISTA DE VARIOS OBJETOS COLABORATIVOS */
	private List<PreguntaJuego> listaPreguntaJuegos;
	
	
	
	/* CONSTRUCTORES */
	
	/* GETTERS N SETTERS */
	
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

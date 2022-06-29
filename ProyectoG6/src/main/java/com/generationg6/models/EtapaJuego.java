package com.generationg6.models;

/* IMPORTAR LIBRERIAS */
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

/* INTERTABLE ETAPA USUARIO*/
/* CREAR ENTIDAD */
@Entity
@Table(name = "etapas_juegos")
public class EtapaJuego {
	
	/*ATRIBUTOS*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/* COLUMNAS CREATED N UPDATED */
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	
	/*MANYTOMANY = 2 MANYTOONE*/
	/*MANYTOONE ETAPA*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "etapa_id")
	/* ATRIBUTO COLABORATIVO */
	private Etapa etapa;

	/*MANYTOONE USUARIO*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "juego_id")
	/* ATRIBUTO COLABORATIVO */
	private Juego juego;
	
	/* CONSTRUCTORES */
	public EtapaJuego() {
		super();
	}

	public EtapaJuego(Long id, Etapa etapa, Juego juego) {
		super();
		this.id = id;
		this.etapa = etapa;
		this.juego = juego;
	}
	
	/* GETTERS N SETTERS */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Etapa getEtapa() {
		return etapa;
	}

	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}

	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
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

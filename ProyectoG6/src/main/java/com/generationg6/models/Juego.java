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

	/* VARIOS JUEGOS PUEDEN ESTAR EN 1 ETAPA */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_etapa")
	/* ATRIBUTO FK COLABORATIVO */
	private Etapa etapa;
	
	/* 1 JUEGO TIENE VARIAS REGLAS */
	@OneToMany(mappedBy = "juego", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	/* LISTA DE VARIOS OBJETOS COLABORATIVOS */
	private List<ConfiguracionJuego> listaConfiguracionJuego;

	/* 1 JUEGO TIENE VARIOS SCORES */
	@OneToMany(mappedBy = "juego", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	/* LISTA DE VARIOS OBJETOS COLABORATIVOS */
	private List<ScoreUsuario> listaScoreUsuario;

	/* CONSTRUCTORES */
	public Juego() {
		super();
	}

	public Juego(Long id, String nombre, String descripcion) {
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

	public List<ConfiguracionJuego> getListaConfiguracionJuego() {
		return listaConfiguracionJuego;
	}

	public void setListaConfiguracionJuego(List<ConfiguracionJuego> listaConfiguracionJuego) {
		this.listaConfiguracionJuego = listaConfiguracionJuego;
	}

	public List<ScoreUsuario> getListaScoreUsuario() {
		return listaScoreUsuario;
	}

	public void setListaScoreUsuario(List<ScoreUsuario> listaScoreUsuario) {
		this.listaScoreUsuario = listaScoreUsuario;
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

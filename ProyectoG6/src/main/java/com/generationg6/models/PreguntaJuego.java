package com.generationg6.models;

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
@Table(name = "preguntas_juegos")
public class PreguntaJuego {

	/* OBJETO Y ATRIBUTO */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String pregunta;
	private String descripcion;
	/* COLUMNAS CREATED N UPDATED */
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;

	/* VARIAS PREGUNTAS TIENEN 1 JUEGO MANY TO ONE */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "juego_id")
	/* ATRIBUTO FK COLABORATIVO */
	private Juego juego;

	/* 1 PREGUNTA TIENE VARIAS RESPUESTAS ONE TO MANY */
	@OneToMany(mappedBy = "preguntaJuego", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	/* LISTA DE VARIOS OBJETOS COLABORATIVOS */
	private List<RespuestaJuego> listaRespuestaJuegos;

	/* CONSTRUCTORES */
	public PreguntaJuego() {
		super();
	}

	public PreguntaJuego(Long id, String pregunta, String descripcion) {
		super();
		this.id = id;
		this.pregunta = pregunta;
		this.descripcion = descripcion;
	}

	/* GETTERS N SETTERS */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	public List<RespuestaJuego> getListaRespuestaJuegos() {
		return listaRespuestaJuegos;
	}

	public void setListaRespuestaJuegos(List<RespuestaJuego> listaRespuestaJuegos) {
		this.listaRespuestaJuegos = listaRespuestaJuegos;
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

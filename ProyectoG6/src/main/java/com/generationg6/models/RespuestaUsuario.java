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

/* CREAR ENTIDAD */
@Entity
@Table(name = "respuestas_juegos")
public class RespuestaJuego {

	/* OBJETO Y ATRIBUTO */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String respuesta;
	private String descripcion;
	/* COLUMNAS CREATED N UPDATED */
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	
	/* VARIAS RESPUESTAS TIENEN 1 PREGUNTA MANY TO ONE */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pregunta_juego_id")
	/* ATRIBUTO FK COLABORATIVO */
	private PreguntaJuego preguntaJuego;
	
	/* VARIAS RESPUESTAS TIENEN 1 USUARIO MANY TO ONE */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	/* ATRIBUTO FK COLABORATIVO */
	private Usuario usuario;

	/* CONSTRUCTORES */
	public RespuestaJuego() {
		super();
	}

	public RespuestaJuego(Long id, String respuesta, String descripcion) {
		super();
		this.id = id;
		this.respuesta = respuesta;
		this.descripcion = descripcion;
	}

	/* GETTERS N SETTERS */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public PreguntaJuego getPreguntaJuego() {
		return preguntaJuego;
	}

	public void setPreguntaJuego(PreguntaJuego preguntaJuego) {
		this.preguntaJuego = preguntaJuego;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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

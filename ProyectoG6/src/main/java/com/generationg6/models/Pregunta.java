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
@Table(name = "preguntas")
public class Pregunta {

	/* OBJETO Y ATRIBUTO */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String descripcion;
	/* COLUMNAS CREATED N UPDATED */
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	
	/* VARIAS PREGUNTAS TIENEN 1 ETAPA MANY TO ONE */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_etapa")
	/* ATRIBUTO FK COLABORATIVO */
	private Etapa etapa;
	
	/* 1 PREGUNTA TIENE VARIAS RESPUESTAS ONE TO MANY */
	@OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	/* LISTA DE VARIOS OBJETOS COLABORATIVOS */
	private List<Alternativa> listaAlternativa;
	
	/* CONSTRUCTORES */
	public Pregunta() {
		super();
	}

	public Pregunta(Long id, String pregunta, String descripcion) {
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Etapa getEtapa() {
		return etapa;
	}

	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}

	public List<Alternativa> getListaAlternativa() {
		return listaAlternativa;
	}

	public void setListaAlternativa(List<Alternativa> listaAlternativa) {
		this.listaAlternativa = listaAlternativa;
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
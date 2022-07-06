package com.generationg6.models;

/* IMPORTAR LIBRERIAS */
<<<<<<< HEAD
=======

import com.fasterxml.jackson.annotation.JsonIgnore;

>>>>>>> MatiRebolledo
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
@Table(name = "etapas_usuarios")
public class EtapaUsuario {
<<<<<<< HEAD
	
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
	@JoinColumn(name = "usuario_id")
	/* ATRIBUTO COLABORATIVO */
	private Usuario usuario;
	
	/* CONSTRUCTORES */
	public EtapaUsuario() {
		super();
	}
	public EtapaUsuario(Long id) {
		super();
		this.id = id;
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
=======

    /*ATRIBUTOS*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /* COLUMNAS CREATED N UPDATED */
    @Column(updatable = false)
    private Date fechaCreacion;
    private Date fechaEdicion;
    
    /*MANYTOONE ETAPA*/
    @JsonIgnore /*De la lista no regresa al padre (contenido) o sino se genera un loop*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_etapa")
    /* ATRIBUTO COLABORATIVO */
    private Etapa etapa;

    /*MANYTOONE USUARIO*/
    @JsonIgnore /*De la lista no regresa al padre (contenido) o sino se genera un loop*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    /* ATRIBUTO COLABORATIVO */
    private Usuario usuario;

    /* CONSTRUCTORES */
    public EtapaUsuario() {
        super();
    }

    public EtapaUsuario(Long id) {
        super();
        this.id = id;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
>>>>>>> MatiRebolledo
}

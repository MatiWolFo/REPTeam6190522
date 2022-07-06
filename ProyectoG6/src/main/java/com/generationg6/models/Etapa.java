package com.generationg6.models;

/* IMPORTAR LIBRERIAS */
<<<<<<< HEAD
=======

import com.fasterxml.jackson.annotation.JsonIgnore;

>>>>>>> MatiRebolledo
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
/* IMPORTAR LIBRERIAS */
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
<<<<<<< HEAD
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
=======
>>>>>>> MatiRebolledo
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

/* CREAR ENTIDAD */
@Entity
@Table(name = "etapas")
public class Etapa {
<<<<<<< HEAD
	
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
	
	
	/* MANYTOMANY ETAPAUSUARIO */
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			/* EL NOMBRE ENTITY DE LA INTERTABLE */
			name = "etapas_usuarios",
			/* DESDE LA ENTIDAD O TABLA PRESENTE */
			joinColumns = @JoinColumn(name = "etapa_id"),
			/* HACIA LA OTRA ENTIDAD O TABLA */
			inverseJoinColumns = @JoinColumn(name = "usuario_id"))
	/* COMO ATRIBUTO DE COLABORACION LA CLASE INVERSEJOIN */
	private List<Usuario> usuarios;
	
	/* MANYTOMANY ETAPAJUEGO */
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			/* EL NOMBRE ENTITY DE LA INTERTABLE */
			name = "etapas_juegos",
			/* DESDE LA ENTIDAD O TABLA PRESENTE */
			joinColumns = @JoinColumn(name = "etapa_id"),
			/* HACIA LA OTRA ENTIDAD O TABLA */
			inverseJoinColumns = @JoinColumn(name = "juego_id"))
	/* COMO ATRIBUTO DE COLABORACION LA CLASE INVERSEJOIN */
	private List<Juego> juegos;
	
	/* VARIAS ETAPAS TIENEN 1 CONTENIDO MANY TO ONE */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contenido_id")
	/* ATRIBUTO FK COLABORATIVO */
	private Contenido contenido;
	
	/* 1 ETAPA TIENE VARIAS PREGUNTAS ONE TO MANY */
	@OneToMany(mappedBy = "etapa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	/* LISTA DE VARIOS OBJETOS COLABORATIVOS */
	private List<PreguntaEtapa> listaPreguntaEtapas;
	
	/* CONSTRUCTORES */
	public Etapa() {
		super();
	}

	public Etapa(Long id, String nombre, String descripcion) {
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

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Juego> getJuegos() {
		return juegos;
	}

	public void setJuegos(List<Juego> juegos) {
		this.juegos = juegos;
	}

	public Contenido getContenido() {
		return contenido;
	}

	public void setContenido(Contenido contenido) {
		this.contenido = contenido;
	}

	public List<PreguntaEtapa> getListaPreguntaEtapas() {
		return listaPreguntaEtapas;
	}

	public void setListaPreguntaEtapas(List<PreguntaEtapa> listaPreguntaEtapas) {
		this.listaPreguntaEtapas = listaPreguntaEtapas;
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


    /* ONETOMANY ETAPA */
    /* LISTA DE VARIOS OBJETOS COLABORATIVOS */

    @OneToMany(mappedBy = "etapa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<EtapaUsuario> listaEtapaUsuario;

    /* LISTA DE VARIOS OBJETOS COLABORATIVOS */
    @OneToMany(mappedBy = "etapa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Juego> listaJuego;

    /* LISTA DE VARIOS OBJETOS COLABORATIVOS */
    @OneToMany(mappedBy = "etapa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Pregunta> listaPregunta;

    /* VARIAS ETAPAS TIENEN 1 CONTENIDO MANY TO ONE */
    @JsonIgnore /*De la lista no regresa al padre (contenido) o sino se genera un loop*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contenido")
    /* ATRIBUTO FK COLABORATIVO */
    private Contenido contenido;


    /* CONSTRUCTORES */

    public Etapa() {
    }

    public Etapa(Long id, String nombre, String descripcion) {
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

    public List<EtapaUsuario> getListaEtapaUsuario() {
        return listaEtapaUsuario;
    }

    public void setListaEtapaUsuario(List<EtapaUsuario> listaEtapaUsuario) {
        this.listaEtapaUsuario = listaEtapaUsuario;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public List<Juego> getListaJuego() {
        return listaJuego;
    }

    public void setListaJuego(List<Juego> listaJuego) {
        this.listaJuego = listaJuego;
    }

    public List<Pregunta> getListaPregunta() {
        return listaPregunta;
    }

    public void setListaPregunta(List<Pregunta> listaPregunta) {
        this.listaPregunta = listaPregunta;
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


package com.generationg6.models;

/* IMPORTAR LIBRERIAS */
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

/* CREAR ENTIDAD */
@Entity
@Table(name = "usuarios")
public class Usuario {

	/* OBJETO Y ATRIBUTO */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private Integer edad;
	private String email;
	private String username;
	private String password;
	/* COLUMNAS CREATED N UPDATED */
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;

	/* VARIOS USUARIOS TIENEN 1 ROL MANY TO ONE */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rol_id")
	/* ATRIBUTO FK COLABORATIVO */
	private Rol rol;

	/* MANYTOMANY ETAPAUSUARIO */
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			/* EL NOMBRE ENTITY DE LA INTERTABLE */
			name = "etapas_usuarios",
			/* DESDE LA ENTIDAD O TABLA PRESENTE */
			joinColumns = @JoinColumn(name = "usuario_id"),
			/* HACIA LA OTRA ENTIDAD O TABLA */
			inverseJoinColumns = @JoinColumn(name = "etapa_id"))
	/* COMO ATRIBUTO DE COLABORACION LA CLASE INVERSEJOIN */
	private List<Etapa> etapas;

	/* CONSTRUCTORES */
	public Usuario() {
		super();
	}

	public Usuario(Long id, String nombre, String apellido, Integer edad, String email, String username,
			String password, Rol rol, List<Etapa> etapas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.email = email;
		this.username = username;
		this.password = password;
		this.rol = rol;
		this.etapas = etapas;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public List<Etapa> getEtapas() {
		return etapas;
	}

	public void setEtapas(List<Etapa> etapas) {
		this.etapas = etapas;
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

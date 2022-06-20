package com.paginas.models;

/*IMPORTAR LAS LIBRERIAS REQUERIDAS*/
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*ESTABLECER LA ENTIDAD Y LA TABLA DEL OBJETO O CLASE CREADA*/
@Entity
@Table(name = "paginas")
/*FUNCION CON SUS ATRIBUTOS*/
public class Paginas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	private String url;
	
	private String nombre;
	
	private String tipo;
	
	private String idioma;
	/*CONSTRUCTORES VACIO Y LLENO*/
	public Paginas() {
		super();
	}
	public Paginas(Long id, String url, String nombre, String tipo, String idioma) {
		super();
		this.id = id;
		this.url = url;
		this.nombre = nombre;
		this.tipo = tipo;
		this.idioma = idioma;
	}
	/*GETTERS Y SETTERS*/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
}

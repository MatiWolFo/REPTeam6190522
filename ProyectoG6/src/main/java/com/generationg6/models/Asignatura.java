package com.generationg6.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "asignaturas")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;

    @OneToMany(mappedBy = "asignatura")
    private List<Modulos> modulosList;

    public Asignatura() {
        super();
    }

    public Asignatura(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

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

    public List<Modulos> getModulosList() {
        return modulosList;
    }

    public void setModulosList(List<Modulos> modulosList) {
        this.modulosList = modulosList;
    }
}

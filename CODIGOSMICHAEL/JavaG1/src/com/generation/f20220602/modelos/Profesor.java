package com.generation.f20220602.modelos;

public class Profesor extends Usuario {
    private String asignatura;

    private String prueba;

    private String direccion;

    private String telefono;

    private String id_escuela;

    private Integer anioentrada;

    private String curriculum;

    public Profesor() {
        super();
    }

    public Profesor(String asignatura, String prueba, String direccion, String telefono, String id_escuela,
                    Integer anioentrada, String curriculum) {
        super();
        this.asignatura = asignatura;
        this.prueba = prueba;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id_escuela = id_escuela;
        this.anioentrada = anioentrada;
        this.curriculum = curriculum;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getId_escuela() {
        return id_escuela;
    }

    public void setId_escuela(String id_escuela) {
        this.id_escuela = id_escuela;
    }

    public Integer getAnioentrada() {
        return anioentrada;
    }

    public void setAnioentrada(Integer anioentrada) {
        this.anioentrada = anioentrada;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    @Override
    public String toString() {
        return "Profesor [asignatura=" + asignatura + ", prueba=" + prueba + ", direccion=" + direccion
                + ", telefono=" + telefono + ", id_escuela=" + id_escuela + ", anioentrada=" + anioentrada
                + ", curriculum=" + curriculum + "]";
    }
}
package com.generation.f20220602.modelos;

import java.util.List;

public class Alumno extends Usuario {

    private Integer id_alum;
    private String curso;
    private Boolean asistencia;
    private String asignatura;

    private List<Alumno> listaAlumnos;

    public Alumno() {
        super();
    }

    public Alumno(Integer id_alum, String curso, Boolean asistencia, String asignatura, List<Alumno> listaAlumnos) {
        this.id_alum = id_alum;
        this.curso = curso;
        this.asistencia = asistencia;
        this.asignatura = asignatura;
        this.listaAlumnos = listaAlumnos;
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public Integer getId_alum() {
        return id_alum;
    }

    public void setId_alum(Integer id_alum) {
        this.id_alum = id_alum;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Boolean getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Boolean asistencia) {
        this.asistencia = asistencia;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {

        return "El alumno " + super.getNombre() +
                " tiene un id de " + id_alum +
                " esta en el curso de " + curso +
                " la asistencia es " + asistencia +
                " la asignatura es " + asignatura + " su correo es " + super.getEmail();
    }
}


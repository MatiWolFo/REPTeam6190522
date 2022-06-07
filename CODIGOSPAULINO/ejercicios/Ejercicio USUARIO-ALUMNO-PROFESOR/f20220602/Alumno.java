package com.generation.f20220602;

public class Alumno extends Usuario {

    private Integer id_alum;
    private String nombre;
    private String curso;
    private Boolean asistencia;
    private String asignatura;

    public Alumno() {
        super();
    }

    public Alumno(Integer id_alum, String nombre, String curso, Boolean asistencia, String asignatura) {
        this.id_alum = id_alum;
        this.nombre = nombre;
        this.curso = curso;
        this.asistencia = asistencia;
        this.asignatura = asignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "Alumno{" +
                "id_alum=" + id_alum +
                ", nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", asistencia=" + asistencia +
                ", asignatura='" + asignatura + '\'' +
                '}' + "\n" +
                "Usuario{" +
                "nombre='" + super.getNombreUsuario() + '\'' +
                ", password='" + super.getPassword() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", sexo='" + super.getSexo() + '\'' +
                '}';
    }

    public String presente() {
        Boolean asistencia = true;
        if (asistencia) {
           String resultado = "Presente";
            return (resultado);
        }else{
            String resultado = "Ausente";
            return (resultado);
        }

    }
}

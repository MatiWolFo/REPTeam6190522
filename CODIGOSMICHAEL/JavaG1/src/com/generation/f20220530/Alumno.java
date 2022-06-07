package com.generation.f20220530;

public class Alumno {


    //atributos
    //Existen private, public y protected estos son accesadores
    //Encapsulamiento ---->Proteger la informacion
    //Private ---> Solo se accede de la misma clase
    //Public ----> Todos pueden acceder
    //Protected ----> Todos los que estan dentro del package pueden acceder


    private String nombre;
    private String Apellido;
    private int edad;
    private String curso;


    //constructores

    //El constructor asigna valores a nuestros atributos

    public Alumno(){
    super();
    }
    public Alumno(String nombre, String apellido, int edad, String curso) {
        super();
        this.nombre = nombre;
        Apellido = apellido;
        this.edad = edad;
        this.curso = curso;
    }


    //setter y getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "Nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Edad=" + edad +
                ", Curso='" + curso + '\'' +
                '}';
    }

//funciones
}

package com.generation.f20220602.modelos;

import java.util.List;

public class Usuario {

    private String nombre;
    private String password;
    private String email;
    private String sexo;
    private List<Usuario> listaUsuarios;

    public Usuario() {
    }

    public Usuario(String nombre, String password, String email, String sexo, List<Usuario> listaUsuarios) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
        this.sexo = sexo;
        this.listaUsuarios = listaUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}
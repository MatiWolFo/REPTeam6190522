package com.generation.f20220602;

public class Usuario {

    private String nombreUsuario;
    private String password;
    private String email;
    private String sexo;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String password, String email, String sexo) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.email = email;
        this.sexo = sexo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombre) {
        this.nombreUsuario = nombre;
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

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombreUsuario + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}

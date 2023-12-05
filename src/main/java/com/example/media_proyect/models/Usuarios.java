package com.example.media_proyect.models;

public class Usuarios {
    private String cvusuario;
    private String nombre;
    private String password;
    private String tipo;

    public Usuarios(){
        cvusuario="";
        nombre="";
        password="";
        tipo="";
    }

    public Usuarios(String cvusuario, String nombre, String password, String tipo) {
        this.cvusuario = cvusuario;
        this.nombre = nombre;
        this.password = password;
        this.tipo = tipo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCvusuario() {
        return cvusuario;
    }

    public void setCvusuario(String cvusuario) {
        this.cvusuario = cvusuario;
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
}

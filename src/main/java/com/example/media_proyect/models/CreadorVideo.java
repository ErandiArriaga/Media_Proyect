package com.example.media_proyect.models;

public class CreadorVideo {
    private String nombre;
    private String urlCanal;
    private Integer id;

    public CreadorVideo(String nombre, String urlCanal, Integer id) {
        this.nombre = nombre;
        this.urlCanal = urlCanal;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlCanal() {
        return urlCanal;
    }

    public void setUrlCanal(String urlCanal) {
        this.urlCanal = urlCanal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

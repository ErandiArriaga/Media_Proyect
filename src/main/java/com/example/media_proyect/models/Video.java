package com.example.media_proyect.models;

import java.util.Date;

public class Video {
    private Integer id;
    private Integer idCreador;
    private String urlVideo;
    private Date fechaPublicacion;
    private String descripcion;
    private String titulo;

    public Video(Integer id, Integer idCreador, String urlVideo, Date fechaPublicacion, String descripcion, String titulo) {
        this.id = id;
        this.idCreador = idCreador;
        this.urlVideo = urlVideo;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcion = descripcion;
        this.titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCreador() {
        return idCreador;
    }

    public void setIdCreador(Integer idCreador) {
        this.idCreador = idCreador;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

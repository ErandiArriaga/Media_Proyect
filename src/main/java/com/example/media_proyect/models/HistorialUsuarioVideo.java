package com.example.media_proyect.models;

import java.util.Date;

public class HistorialUsuarioVideo {
    private Integer idVideo;
    private Integer idUsuarios;
    private Date fechaVista;

    public HistorialUsuarioVideo(Integer idVideo, Integer idUsuarios, Date fechaVista) {
        this.idVideo = idVideo;
        this.idUsuarios = idUsuarios;
        this.fechaVista = fechaVista;
    }

    public Integer getIdVideo() {
        return idVideo;
    }

    public void setIdVideo(Integer idVideo) {
        this.idVideo = idVideo;
    }

    public Integer getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(Integer idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public Date getFechaVista() {
        return fechaVista;
    }

    public void setFechaVista(Date fechaVista) {
        this.fechaVista = fechaVista;
    }
}

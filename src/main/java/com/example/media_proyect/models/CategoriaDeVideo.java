package com.example.media_proyect.models;

public class CategoriaDeVideo {
    private Integer idVideo;
    private Integer idCategoria;

    public CategoriaDeVideo(Integer idVideo, Integer idCategoria) {
        this.idVideo = idVideo;
        this.idCategoria = idCategoria;
    }

    public Integer getIdVideo() {
        return idVideo;
    }

    public void setIdVideo(Integer idVideo) {
        this.idVideo = idVideo;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
}

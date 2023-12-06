package com.example.media_proyect.models;

public class TipoPago {
    private Integer id;
    private String tipoPago;
    private boolean estado;

    public TipoPago(Integer id, String tipoPago, boolean estado) {
        this.id = id;
        this.tipoPago = tipoPago;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

package com.example.media_proyect.models;

import java.util.Date;

public class HistorialPagos {
    private Integer idUsuarios;
    private Integer idTipoPago;
    private double cantidad;
    private Date fechaPago;

    public HistorialPagos(Integer idUsuarios, Integer idTipoPago, double cantidad, Date fechaPago) {
        this.idUsuarios = idUsuarios;
        this.idTipoPago = idTipoPago;
        this.cantidad = cantidad;
        this.fechaPago = fechaPago;
    }

    public Integer getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(Integer idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public Integer getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(Integer idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }
}

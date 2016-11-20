/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

/**
 *
 * @author Oscar
 */
public class EdificioBean {
    private String tipoEdificio;
    private int habitaciones;
    private int fechaConstruccion;
    private String tipoConstruccion;
    private int valor;

    public String getTipoEdificio() {
        return tipoEdificio;
    }

    public void setTipoEdificio(String tipoEdificio) {
        this.tipoEdificio = tipoEdificio;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(int fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public String getTipoConstruccion() {
        return tipoConstruccion;
    }

    public void setTipoConstruccion(String tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}

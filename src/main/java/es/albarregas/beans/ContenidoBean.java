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
public class ContenidoBean {
    private boolean accidentales;
    private int cantidad;
    private String franquicia;

    public boolean isAccidentales() {
        return accidentales;
    }

    public void setAccidentales(boolean accidentales) {
        this.accidentales = accidentales;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }
    
}

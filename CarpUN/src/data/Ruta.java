/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author juanvargas
 */
public class Ruta 
{
    private String origen;
    private String destino;
    private long id;
    private String ruta;
    private boolean desvio;
    private int puestosLibres;
    private float precio;
    private Date horaSalida;
    private Conductor conductorRuta;

    //Constructor
    public Ruta() 
    {

    }

    public Ruta(Conductor conductorRuta) 
    {
        this.conductorRuta = conductorRuta;
    }

    //Getters and Setters
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public boolean isDesvio() {
        return desvio;
    }

    public void setDesvio(boolean desvio) {
        this.desvio = desvio;
    }

    public int getPuestosLibres() {
        return puestosLibres;
    }

    public void setPuestosLibres(int puestosLibres) {
        this.puestosLibres = puestosLibres;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Conductor getConductorRuta() {
        return conductorRuta;
    }

    public void setConductorRuta(Conductor conductorRuta) {
        this.conductorRuta = conductorRuta;
    }
    
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author juanvargas
 */
public class Pasajero extends Usuario
{
    private ArrayList<Ruta> posMatch;
    
    //Constructores
    public Pasajero(String nombrDeUsuario, String clave) 
    {
        super(nombrDeUsuario, clave);
        this.posMatch = null;
    }

    public Pasajero(String nombre, String nombrDeUsuario, String clave, String universidad, long telefono, String correo) 
    {
        super(nombre, nombrDeUsuario, clave, universidad, telefono, correo);
        this.posMatch = null;
    }
    
    
    
    public Pasajero()
    {
        
    }
    
    
}

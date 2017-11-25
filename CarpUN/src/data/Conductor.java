/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author juanvargas
 */
public class Conductor extends Usuario
{
    private Ruta ruta;
    
    //Constructores
    public Conductor(String nombrDeUsuario, String clave) 
    {
        super(nombrDeUsuario, clave);
        this.ruta = new Ruta(this); // Crea una ruta con conductor
    }

    public Conductor(String nombre, String nombrDeUsuario, String clave, String universidad, long telefono, String correo) 
    {
        super(nombre, nombrDeUsuario, clave, universidad, telefono, correo);
        this.ruta = new Ruta(this); // Crea una ruta con conductor
    }

    
    
    public Conductor() 
    {
        
    }

    //Getters and Setters
    
    public Ruta getRuta()
    {
        return ruta;
    }

   
    
    
    
    
    
    
}

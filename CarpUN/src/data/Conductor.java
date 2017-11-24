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
    
    public Conductor(String nombrDeUsuario, String clave) 
    {
        super(nombrDeUsuario, clave);
        this.ruta = new Ruta(this); // Crea una ruta con conductor
    }
    
    
}

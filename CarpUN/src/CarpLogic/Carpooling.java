/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarpLogic;

import data.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author juanvargas
 */
public class Carpooling
{
    private CarpUN programa;
    
    //Constructor

    public Carpooling() 
    {
        this.programa = new CarpUN();
    }
    
    
    /**
     * Registro de usuario: Conductor o Pasajero
     * @param tipo
     * @param nombre
     * @param nombrDeUsuario
     * @param clave
     * @param universidad
     * @param telefono
     * @param correo
     * @return boolean
     */
    public boolean registrarUsuario(String tipo, String nombre, String nombrDeUsuario, String clave, 
            String universidad, long telefono, String correo)
    {
        if(tipo.equals("Conductor"))
        {
            return this.programa.addUsuarioConductor(nombre, nombrDeUsuario, clave, universidad, telefono, correo);
    
        }if(tipo.equals("Pasajero"))
        {
            return this.programa.addUsuarioPasajero(nombre, nombrDeUsuario, clave, universidad, telefono, correo);
        }else
        {
            return false;
        }
    }
    
    /**
     * Cmabia de rol: Si es Usuario-Conductor lo reemplaza por un Usuario-Pasajero con los mismos datos
     * @param nombrUsuario 
     */
    public void cambiarDeRol(String nombrUsuario)
    {
        String tipo = null;
        int index = 0;
        for (Usuario usuario: this.programa.getUsuarios()) 
        {
            if( usuario.getNombrDeUsuario().equals(nombrUsuario) )
            {
                tipo = usuario.getClass().getSimpleName();
                index = this.programa.getUsuarios().indexOf(usuario);
                if(tipo.equals("Conductor"))
                {
                    
                    Usuario pasajero = new Pasajero(); //Crear vacio y despues usar Sets
                                                       //O crear objeto dando los datos en el constructor
                    this.programa.replaceUsuario(pasajero, index);
                    break;
                }if(tipo.equals("Pasajero"))
                {
                    Usuario conductor = new Conductor();
                    this.programa.replaceUsuario(conductor, index);
                    break;
                }
                   
            }else
            {
                throw new IllegalArgumentException(); //O algun otro tipo de erro para indicar que el nombre de usuario no existe
            }
        }
        
    }
    
    public Ruta setRutaData(Conductor c, String origen, String destino, long id,
                                String ruta, boolean desvio, int puestosLibres, int precio, Date horaSalida)
    {
        c.getRuta().setOrigen(origen);
        c.getRuta().setDestino(destino);
        c.getRuta().setId(id);
        c.getRuta().setRuta(ruta);
        c.getRuta().setDesvio(desvio);
        c.getRuta().setPuestosLibres(puestosLibres);
        c.getRuta().setPrecio(precio);
        c.getRuta().setHoraSalida(horaSalida);
        return c.getRuta();
    }
    
    /*
    public ArrayList<Ruta> posiblesMatchPasajero()
    {
        
    }
    
    public void setRuta(Conductor c)
    {
        
    }
    
    
    public Viaje crearViaje()
    
    
    */
   
    
}

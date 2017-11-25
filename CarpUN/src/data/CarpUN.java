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
public class CarpUN 
{
    private ArrayList<Usuario> usuarios;
    private int numeroUsuarios;

    public CarpUN() 
    {
        this.usuarios = new ArrayList<>();
        this.numeroUsuarios = 0;
    }
    
    /**
     * Añade un usuario - conductro
     * @param nombre
     * @param nombrDeUsuario
     * @param clave
     * @param universidad
     * @param telefono
     * @param correo
     * @return 
     */
    public boolean addUsuarioConductor(String nombre, String nombrDeUsuario, String clave, 
            String universidad, long telefono, String correo)
    {
        Usuario conductor = new Conductor(nombre, nombrDeUsuario, clave, universidad, telefono, correo);
        this.numeroUsuarios++;
        return this.usuarios.add(conductor);   
    }
    
    /**
     * 
     * @param nombre
     * @param nombrDeUsuario
     * @param clave
     * @param universidad
     * @param telefono
     * @param correo
     * @return 
     */
    public boolean addUsuarioPasajero(String nombre, String nombrDeUsuario, String clave, 
            String universidad, long telefono, String correo)
    {
        Usuario pasajero = new Pasajero(nombre, nombrDeUsuario, clave, universidad, telefono, correo);
        this.numeroUsuarios++;
        return this.usuarios.add(pasajero);   
    }
    
    public void replaceUsuario(Usuario u, int index)
    {
        this.usuarios.add(index, u);
    }
    
    public Usuario getUsusario(String nombrUsuario)
    {
        for (Usuario usuario : this.usuarios) 
        {
            if( usuario.getNombrDeUsuario().equals(nombrUsuario) )
            {
                return usuario;
            }
        }
        return null;
    }
    
    //Getters and Setters
    public ArrayList<Usuario> getUsuarios()
    {
        return usuarios;
    }

    public int getNumeroUsuarios() 
    {
        return numeroUsuarios;
    }
    
    
}

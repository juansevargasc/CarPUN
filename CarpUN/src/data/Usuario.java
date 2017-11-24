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
public class Usuario
{
    String nombre;
    String nombrDeUsuario;
    String clave;
    String universidad;
    long telefono;
    String correo;
    
    //Constructores
    public Usuario(String nombrDeUsuario, String clave)
    {
        this.nombrDeUsuario = nombrDeUsuario;
        this.clave = clave;
    }

    public Usuario(String nombre, String nombrDeUsuario, String clave, String universidad, long telefono, String correo)
    {
        this.nombre = nombre;
        this.nombrDeUsuario = nombrDeUsuario;
        this.clave = clave;
        this.universidad = universidad;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    
    
    //Getters and Setters
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getNombrDeUsuario() 
    {
        return nombrDeUsuario;
    }

    public void setNombrDeUsuario(String nombrDeUsuario) 
    {
        this.nombrDeUsuario = nombrDeUsuario;
    }

    public String getUniversidad() 
    {
        return universidad;
    }

    public void setUniversidad(String universidad) 
    {
        this.universidad = universidad;
    }

    public long getTelefono() 
    {
        return telefono;
    }

    public void setTelefono(long telefono) 
    {
        this.telefono = telefono;
    }

    public String getCorreo() 
    {
        return correo;
    }

    public void setCorreo(String correo)
    {
        this.correo = correo;
    }

    public String getClave() 
    {
        return clave;
    }

    public void setClave(String clave) 
    {
        this.clave = clave;
    }
    
}

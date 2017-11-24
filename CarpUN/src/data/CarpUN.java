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
    ArrayList<Usuario> usuarios;

    public CarpUN() 
    {
        this.usuarios = new ArrayList<>();
    }
    
    public boolean addUsuario(String nombre, String nombrDeUsuario, String clave, 
            String universidad, long telefono, String correo)
    {
        Usuario usuario = new Usuario(nombre, nombrDeUsuario, clave, universidad, telefono, correo);
        return this.usuarios.add(usuario);   
    }
    
}

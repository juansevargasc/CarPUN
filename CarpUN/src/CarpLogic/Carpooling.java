/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarpLogic;

import data.*;

/**
 *
 * @author juanvargas
 */
public class Carpooling
{
    private CarpUN programa;
    
    /**
     * Registro de usuario
     * @param nombre
     * @param nombrDeUsuario
     * @param clave
     * @param universidad
     * @param telefono
     * @param correo
     * @return boolean
     */
    public boolean registrarUsuario(String nombre, String nombrDeUsuario, String clave, 
            String universidad, long telefono, String correo)
    {
        return this.programa.addUsuario(nombre, nombrDeUsuario, clave, universidad, telefono, correo);
    }
    
    
}

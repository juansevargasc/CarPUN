/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.*;


/**
 *
 * @author juanvargas
 */
public class mainCP 
{
    public static void main(String[] args)
    {
        Usuario u1 = new Conductor();
        
        System.out.println("1. Clase u1: " + u1.getClass().getSimpleName());
        
        Conductor c1 = (Conductor) u1;
       
        System.out.println("2. Clase u1: " + u1.getClass().getSimpleName());
        
    }
    
}

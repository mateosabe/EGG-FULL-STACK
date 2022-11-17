/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejercicio1;

import Entidad.Libro;
import Servicio.LibroServicio;

/**
 *
 * @author mateo
 */
public class Guia7_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        LibroServicio LS = new LibroServicio();
        
        Libro Libro1 = LS.CargarLibro();
                
        
    }
    
}

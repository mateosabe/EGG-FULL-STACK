/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteClaseMain;

import paqueteClaseServicio.servicioRectangulo;
import paqueteEntidad.rectangulo;

/**
 *
 * @author msabella
 */
public class claseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        servicioRectangulo SR=new servicioRectangulo();
        
        rectangulo R2=SR.crearRectangulo();
        SR.mostrarRectangulo(R2);
        SR.calcularSuperficieRectangulo(R2);
        SR.calcularPerimetroRectangulo(R2);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejercicio3;
import Entidad.Operacion;
import Servicio.ServicioOperacion;


/**
 *
 * @author msabella
 */
public class Guia7_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioOperacion SO = new ServicioOperacion();
        
        Operacion S1=new Operacion();
        
        S1=SO.crearOperacion(S1);
        
        System.out.println("La suma es: " + SO.sumar(S1));
        System.out.println("La resta es: " + SO.restar(S1));
         System.out.println("La multiplicacion es: " + SO.multiplicar(S1));
          System.out.println("La division es: " + SO.dividir(S1));

    }
}

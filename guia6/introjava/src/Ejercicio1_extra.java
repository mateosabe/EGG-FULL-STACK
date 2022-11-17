
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
public class Ejercicio1_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese minutos, para ver su equivalente en dias y horas. ");
        int minutos = leer.nextInt();
        
        int dias = minutos/(60*24);
        int horas = minutos/60;
        
        System.out.println("su equivalente en dias es "+ dias + "su equivalente en horas es: "+horas);
      
    }
    
}

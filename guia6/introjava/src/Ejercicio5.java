
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author msabella
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        double num;
        System.out.println("ingresar número entero");
        num = leer.nextInt();
        System.out.println("el doble de su número es: " + num*2);
        System.out.println("el triple de su número es: " + num*3);
        System.out.println("la raiz cuadrada de su número es: " + Math.sqrt(num));
    }
    
}

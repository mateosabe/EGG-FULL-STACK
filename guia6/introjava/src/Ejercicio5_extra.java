
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
public class Ejercicio5_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese A,B o C según el tipo de socio");
        String opc = leer.next();
        int valor;
        opc = opc.toLowerCase();
         switch (opc) { //con minúscula!!!!
                case "a":
                System.out.println("usted es de tipo A, ahora ingrese el valor del tratamiento");
                valor = leer.nextInt();
                
                System.out.println("usted tiene un descuento del 50%, el costo final es de: "+(valor*0.5));
               case "b":
                System.out.println("usted es de tipo B, ahora ingrese el valor del tratamiento");
                valor = leer.nextInt();
                
                System.out.println("usted tiene un descuento del 50%, el costo final es de: "+(valor*0.65));
                case "c":
                System.out.println("usted es de tipo C, por lo tanto no tiene descuento en el tratamiento");
                default:
                    System.out.println("socio " + opc+ " no válido");
        
    }
    }
}

   
    


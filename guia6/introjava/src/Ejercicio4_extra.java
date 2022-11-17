
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
public class Ejercicio4_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese número del 1 al 10, para ver su equivalente en romano");
       int numero=leer.nextInt();
       
       switch(numero){
           case 1:
               System.out.println("el equivalente al número 1 es: I");
               break;
           case 2:
               System.out.println("el equivalente al número 2 es: II");
               break;
          case 3:
               System.out.println("el equivalente al número 3 es: III");
               break;
          case 4:
               System.out.println("el equivalente al número 4 es: IV");
               break;
          case 5:
               System.out.println("el equivalente al número 5 es: V");
               break;
         case 6:
               System.out.println("el equivalente al número 6 es: VI");
               break;
         case 7:
               System.out.println("el equivalente al número 7 es: VII");
               break;
         case 8:
               System.out.println("el equivalente al número 8 es: VIII");
               break;
         case 9:
               System.out.println("el equivalente al número 9 es: IX");
               break;
         case 10:
               System.out.println("el equivalente al número 10 es: X");
               break;
         default:
             System.out.println("en número ingresado es inválido");
               
          
       }
      
    }
    
}


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscarloha
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
        */
        
          Scanner leer = new Scanner(System.in);
        int op = 0;
        int g;
        int lg1 = 0;
        int lg2 = 0;
        int lg3 = 0;
        int lg4 = 0;
        int lg5 = 0;
        
        
        
        
        
        System.out.println("Ingresa el tamano de la variable");
        int n = leer.nextInt();
        int [] vector = new int [n];
        
        for (int i = 0; i < n;i++){
            vector[i] = (int)(Math.random()*99999)+1;
        }
        
        System.out.println("La variable es:");
        for (int i = 0; i < n;i++){
            System.out.println(vector[i]); 
            g = vector[i];
            
         if (g >= 10){
             while (g != 0) {
            g = g / 10;
            op = op + 1;
             }
         } else {
             op = 1;
         }
             
           
          
           switch (op){
            case 1:
                lg1 = lg1 + 1;
                break;
            case 2:
                lg2 = lg2 + 1;
                break;
            case 3:   
                lg3 = lg3 + 1;
                break;
            case 4:   
                lg4 = lg4 + 1;
                break;
            case 5:    
                lg5 = lg5 + 1;
                break;
                           
           }  
           op = 0;
        }
        
        System.out.println("El total de veces repetida cada longitud del numero es:");
        System.out.println("1 elemento "+lg1);
        System.out.println("2 elementos "+lg2);
        System.out.println("3 elementos "+lg3);
        System.out.println("4 elementos"+lg4);
        System.out.println("5 elementos "+lg5);
    }
    
}

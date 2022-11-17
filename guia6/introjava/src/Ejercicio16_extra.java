
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
public class Ejercicio16_extra {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un número para verificar si es primo o no:");
        int num = leer.nextInt();
        if(esPrimo(num)==true){
            System.out.println("El número " + num + " es un número primo.");
        }else{
            System.out.println("El número " + num + " NO es un número primo.");
        }
    }
 
    public static Boolean esPrimo(int n){
        Boolean es = true;
        for (int i = 2; i <n; i++) {
          
            if (n%i == 0){
                es = false;
                break;
            }
 }
        return es;
     }
     }

    
    

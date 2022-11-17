
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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Ingrese la palabra secreta");
        String palabra = reader.next();
        
        if (palabra.equals ("eureka")){
            System.out.println("correcta");
        } 
        else {
            System.out.println("incorrecta");
          }  
    }
    
}

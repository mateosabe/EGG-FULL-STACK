
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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ingrese dos valores positivos");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        String opcion = "n";
            
        do {
        
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija una opción: ");
        int opc = leer.nextInt();
        
        switch (opc){
            case 1:
                System.out.println("el resultado de sumar los dos números: "+ (num1+num2));
                
                break;
            case 2:
                System.out.println("el resultado de restsr los dos números: "+ (num1-num2));
               
                break;
            case 3:
                System.out.println("el resultado de multiplicar los dos números: "+ (num1*num2));
               
                break;
            case 4:
                System.out.println("el resultado de dividir los dos números: "+ (num1/num2));
                
                break;
            case 5: 
                System.out.println("Está seguro que desea salir del programa? (S/N)");
                opcion = leer.next();
                 
                break;
               
            default:
                System.out.println("el valor ingresado es incorrecto");
        }           
        }while (opcion.equalsIgnoreCase("n"));
    }
    }
    
        
    
    


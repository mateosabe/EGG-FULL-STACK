
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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        int num, suma, numlim;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese Valor Limite");
        numlim=leer.nextInt();
        suma=0;
        do {
            System.out.println("Ingrese Valor a sumar");
            suma=suma+leer.nextInt();
        } while (suma<numlim);
        
        System.out.println("El valor limite "+numlim+" Fue superado por la suma de los valores ingresados "+suma);
}
}

import java.util.Scanner;

/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma

 */

/**
 *
 * @author msabella
 */
public class Eejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int num1, num2, resultado;
        System.out.println("ingrese un número");
        num1 = leer.nextInt();
        System.out.println("ingrese un nuevo número");
        num2 = leer.nextInt();
        resultado = num1 + num2;
        System.out.println("El resultado de la suma es:" + resultado);
                
    }
    
}

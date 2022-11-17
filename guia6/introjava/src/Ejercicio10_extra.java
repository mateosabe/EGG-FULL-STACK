
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
public class Ejercicio10_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        boolean condicion;

        int value1 = (int) (Math.random() * 10) + 1;
        int value2 = (int) (Math.random() * 10) + 1;

        System.out.println("La multiplicacion entre " + value1 + " y " + value2 + " es: ");

        do {
            int result = reader.nextInt();
            if (result == (value1 * value2)) {
                System.out.println("Se saco la loteria " + result);
                condicion = false;
            } else {
                System.out.println("le erró, vuelva a ingresarlo ");
                condicion = true;
            }
        } while (condicion == true);
    }
}

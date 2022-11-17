
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
public class Ejercicio24_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese cuantos de los primeros números de fibonacci desea visualizar: ");

        int n = leer.nextInt();
        int[] vector = new int[n];

        fibonacci(n, vector);

    }

    public static void fibonacci(int n, int[] vector) {

        vector[0] = 0;
        vector[1] = 1;

        for (int i = 2; i < n; i++) {
            vector[i] = (vector[i - 1]) + (vector[i - 2]);
            System.out.println("el valor de fibonacci: " + i + " de " + vector[i - 1] + " + " + vector[i - 2] + " = " + vector[i]);
        }

    }

}

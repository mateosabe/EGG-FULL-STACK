
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
public class Ejercicio6_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese la cantidad de personar para ver promedio de altura");
        int n = leer.nextInt();
        float[] vector = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.println("ingrese altura de la persona " + (i + 1));
            vector[i] = leer.nextFloat();

        }
        System.out.println("promedio hasta 1,6m.");
        float suma = 0;
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] <= 1.6) {
                suma = suma + vector[i];
                contador++;

            }

        }
        System.out.println(suma / contador);

        System.out.println("promedio total");
        suma = 0;
        contador = 0;
        for (int i = 0; i < n; i++) {

            suma = suma + vector[i];
            contador++;

        }
        System.out.println(suma / contador);
    }

}

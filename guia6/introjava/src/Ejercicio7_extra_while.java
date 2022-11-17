
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
public class Ejercicio7_extra_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese número de valores mayores a 0 a introducir.");
        int cantidad = leer.nextInt();
        int[] vector = new int[cantidad];
        int valor = 0;
        int maximo = 0, minimo = 0, suma = 0;
        for (int i = 0; i < cantidad; i++) {
            boolean error = false;
            while (error == false) {
                System.out.println("ingrese valor " + (i + 1));
                valor = leer.nextInt();
                if (valor > 0) {
                    vector[i] = valor;
                    suma = suma + valor;
                    if (i == 0) {
                        minimo = valor;
                        maximo = valor;
                    } else {
                        if (valor < minimo) {
                            minimo = valor;
                        }
                        if (valor > maximo) {
                            maximo = valor;
                        }
                    }
                    error = true;
                } else {
                    System.out.println("valor fuera de rango");
                    error = false;
                }
            }
        }
        System.out.println("el valor mínimo ingresado es: " + minimo);
        System.out.println("el valor máximo ingresado es: " + maximo);
        System.out.println("el promedio es; " + (suma / vector.length));
    }
}

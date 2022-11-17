
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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String cadena;
        int correcto, incorrectos;
        correcto = 0;
        incorrectos = 0;
        boolean salir = false;
        do {
            System.out.println("Ingrese cadena de tamaño 5 y para terminar ingrese FDE (&&&&&) ");
            cadena = leer.nextLine();

            if ((cadena.length() == 5) && (cadena.substring(0, 1).equalsIgnoreCase("X")) && (cadena.substring(4, 5).equalsIgnoreCase("O"))) {
                System.out.println("La cadena es correcta");
                correcto++;

            } else if (cadena.equals("&&&&&")) {
                salir = true;
            } else {
                System.out.println("La cadena no es correcta");

                incorrectos++;
            }

            System.out.println("Cadenas correctas: " + correcto);
            System.out.println("Cadenas incorrectas: " + incorrectos);

        } while (salir == false);
        System.out.println("se ha salido del programa");

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejercicio6;

import ServicioCafetera.ServicioCafetera;
import java.util.Scanner;
import paqueteCafetera.Cafetera;

/**
 *
 * @author msabella
 */
public class Guia7_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ServicioCafetera S1 = new ServicioCafetera();
        Cafetera C = S1.crearCafetera();

        int opcionCafe;
        do {
            System.out.println("Ingrese la opcion que desee: ");
            System.out.println("");
            System.out.println("Llenar cafetera: 1 ");
            System.out.println("Servir taza de cafe: 2 ");
            System.out.println("Vaciar cafetera: 3 ");
            System.out.println("Agregar cafe: 4 ");
            System.out.println("Salir: 5");
            opcionCafe = leer.nextInt();
            switch (opcionCafe) {
                case 1:
                    S1.llenarCafetera(C);
                    break;
                case 2:
                    S1.servirTaza(C);      
                    break;
                case 3:
                    S1.vaciarCafetera(C);
                    break;
                case 4:
                    S1.agregarCafe(C);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            System.out.println("");
            System.out.println("Se volverá al menu...");
            System.out.println("");
        } while (opcionCafe != 5);

    }

}

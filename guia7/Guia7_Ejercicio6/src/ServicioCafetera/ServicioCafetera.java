/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioCafetera;

import java.util.Scanner;
import paqueteCafetera.Cafetera;

/**
 *
 * @author msabella
 */
public class ServicioCafetera {

    Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {
        Cafetera C = new Cafetera();
        int tamanio;
        do {
            System.out.println("Ingrese capacidad máxima de cafe de su cafetera, entre 150 y 1000ml");
            tamanio = leer.nextInt();

            if (tamanio < 150 || tamanio > 1000) {
                System.out.println("Tamaño de cafetera no válido, por favor ingrese entre rango de 150 a 1000ml");
            }

        } while (tamanio < 150 || tamanio > 1000);

        C.setCapacidadMaxima(tamanio);

        return C;
    }

    public void llenarCafetera(Cafetera C) {
        C.setCapacidadActual(C.getCapacidadMaxima());
        
        System.out.println("Cafetera al 100%");

    }

    public void servirTaza(Cafetera C) {
        int tamanioTaza, tazaCafe;

        do {
            System.out.println("Ingrese tamaño de la taza vacia puede ser de 150, 200, 250 o de 300ml");

            tamanioTaza = leer.nextInt();

            if ((tamanioTaza != 150) && (tamanioTaza != 200) && (tamanioTaza != 250) && (tamanioTaza != 300)) {
                System.out.println("Tamaño de taza no válido");
            }

        } while ((tamanioTaza != 150) && (tamanioTaza != 200) && (tamanioTaza != 250) && (tamanioTaza != 300));

        if (C.getCapacidadActual() < tamanioTaza) {
            System.out.println("La cantidad de cafe no alcanza para completar la taza");
            tazaCafe = C.getCapacidadActual();
            C.setCapacidadActual(0);
            System.out.println("La taza no se llenó completamente, quedó en " + tazaCafe + "ml, de " + tamanioTaza + "ml. La cantidade de cafe restante en la cafetera es " + C.getCapacidadActual());
        } else {
            tazaCafe = tamanioTaza;
            System.out.println("La taza se llenó completamente, cuenta con " + tazaCafe + "ml de cafe");
            C.setCapacidadActual(C.getCapacidadActual() - tamanioTaza);
            System.out.println("Le quedan " + C.getCapacidadActual() + "ml de cafe restantes en su cafetera");

        }

    }

    public void vaciarCafetera(Cafetera C) {
        C.setCapacidadActual(0);
        System.out.println("Cafetera al 0%");

    }

    public void agregarCafe(Cafetera C) {
        int cantidadAgregar;
        boolean condicion=false;
        do {
            System.out.println("Ingrese cantidad de cafe a agregar, no superar los  " + C.getCapacidadMaxima() + "ml (capacidad máxima), usted posee " + C.getCapacidadActual() + "ml, de cafe en su cafetera");
            cantidadAgregar = leer.nextInt();
            if ((cantidadAgregar + C.getCapacidadActual()) > C.getCapacidadMaxima()) {
                System.out.println("No puede pasarse del valor máximo");
            } else {
                C.setCapacidadActual(cantidadAgregar+C.getCapacidadActual());
                condicion=true;
            }
        } while (condicion==false);
        System.out.println("Cafetera con "+C.getCapacidadActual()+"ml de cafe diponible.");
        System.out.println("");
    }
}

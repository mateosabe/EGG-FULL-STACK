/*
 * A continuación, en la clase main hacer lo siguiente:

Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package guia7_ejercicio7;

import java.util.Scanner;
import paqutePersona.persona;
import servicioPersona.servicioPersona;

/**
 *
 * @author mateo
 */
public class Guia7_Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servicioPersona P1 = new servicioPersona();
        int DPI = 0, PI = 0, API = 0, mayores = 0, menores = 0;

        System.out.println("Ingrese cantidad de personas");
        int cantidadPersonas = leer.nextInt();

        //int [] IMC = new int[cantidadPersonas];
        //boolean [] mym = new boolean[cantidadPersonas];
        // persona Pers[] = new persona[cantidadPersonas];
        for (int i = 0; i < cantidadPersonas; i++) {
            persona P2 = P1.crearPersona();

            P1.calcularIMC(P2);

            switch ((int) P2.getIMC()) {
                case -1:
                    DPI++;
                    break;
                case 0:
                    PI++;
                    break;
                case 1:
                    API++;
                    break;
            }

            if (P1.esMayorDeEdad(P2) == true) {
                mayores++;
            } else {
                menores++;
            }

        }
        System.out.println("______________________________________________________________");
        System.out.println("\n Porcentaje de personas debajo de su peso ideal: " + ((DPI * 100) / cantidadPersonas)
                + "\n Porcentaje de personas en su peso ideal: " + ((PI * 100) / cantidadPersonas)
                + "\n Porcentaje de personas con sobrepeso: " + ((API * 100) / cantidadPersonas));
        System.out.println("___________________________________________________________________");

        System.out.println("______________________________________________________________");
        System.out.println("\n De las" + cantidadPersonas + " personas son mayores: " + mayores + "\n De las " + cantidadPersonas + " personas son menores: " + menores);
        System.out.println("___________________________________________________________________");
    }

}

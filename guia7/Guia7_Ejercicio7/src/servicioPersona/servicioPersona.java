/*
 • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
 */
package servicioPersona;

import java.util.Scanner;

import paqutePersona.persona;

/*
 * @author mateo
 */
public class servicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public persona crearPersona() {
        persona P1 = new persona();

        System.out.println("Ingrese los datos de la persona");
        System.out.println("");
        System.out.println("Ingrese nombre: ");
        P1.setNombre(leer.next());
        System.out.println("Ingrese edad");
        P1.setEdad(leer.nextInt());
        String sexo;
        boolean condicion = false;

        do {
            System.out.println("Ingrese sexo H(hombre), M(mujer), o O(otro)");
            sexo = leer.next();
            if (sexo.equalsIgnoreCase("h") || sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("o")) {
                P1.setSexo(sexo);
                condicion = true;

            } else {
                System.out.println("El valor ingresado es inválido, por favor, intente de nuevo");

            }
        } while (condicion == false);
        
        System.out.println("Ingrese peso: ");
        P1.setPeso(leer.nextInt());
        System.out.println("Ingrese altura: ");
        P1.setAltura(leer.nextFloat());

        return P1;
    }

    public void calcularIMC(persona P1) {

        float IMC = P1.getPeso() / (P1.getAltura() * P1.getAltura());

        if (IMC >= 20 && IMC <= 25) {
            P1.setIMC(0);
        } else {
            if (IMC < 20) {
                P1.setIMC(-1);

            } else {
                P1.setIMC(1);
            }
        }

    }

    public boolean esMayorDeEdad(persona P1) {
        boolean retorno = false;

        if (P1.getEdad() > 18) {
            retorno = true;
        }
        return retorno;
    }

}

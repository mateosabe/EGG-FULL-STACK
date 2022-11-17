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
    Scanner leer = new Scanner(System.in).useDelimiter("/n");
    
    public crearPersona(){
        persona P1 = new persona();
        
        System.out.println("Ingrese los datos de la persona");
        System.out.println("");
        System.out.println("Ingrese nombre: "+P1.setNombre(leer.next()));
        
        return P1;
    }
}

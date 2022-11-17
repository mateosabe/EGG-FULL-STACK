
import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */

/**
 *
 * @author msabella
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double centigrados, f;
        System.out.println("ingrese los grados centrigrados");
        centigrados = leer.nextDouble();
        f = (1.8*centigrados)+ 32;
        System.out.println("el resultado de convertir los grados centigrados a farenheit es: " + f);
        
    }
    
}

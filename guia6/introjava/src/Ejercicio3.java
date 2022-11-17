
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */

/**
 *
 * @author msabella
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        String frase;
        System.out.println("ingrese una frase");
        frase = leer.nextLine();
        System.out.println("la frase en mayusculas:" + frase.toUpperCase());
        System.out.println("la frase en minusculas:" + toLowerCase(frase));
        frase = leer.nextLine();
        System.out.println("la frase en mayusculas:" + frase.toUpperCase());
        System.out.println("la frase en minusculas:" + toLowerCase(frase));
        
    }
    
}

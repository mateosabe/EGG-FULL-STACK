
import java.util.Scanner;

/*
 Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
 */

/**
 *
 * @author msabella
 */
public class Ejercicio9_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int dividendo,divisor,residuo;
        int contador=0;
        System.out.println("ingrese el dividendo");
        dividendo = leer.nextInt();
        do {            
            System.out.println("ingrese el divisor");
        divisor=leer.nextInt();
            if (divisor > dividendo) {
                System.out.println("el valor debe ser menor o igual a: " + dividendo);
            }
        
        } while (divisor>dividendo);
        residuo=dividendo;
        do {      
            contador++;
            System.out.println(residuo+"-"+divisor+ " = " + (residuo-divisor)+" "+contador +" restas realizadas");
            residuo=residuo-divisor;
        } while (residuo>divisor);

    }
    
}

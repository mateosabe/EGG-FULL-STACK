
import java.util.Scanner;

/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */

 /*
 * @author msabella
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese número de elementos");
        int elementos = leer.nextInt();
        int i, j;

        for (i = 0; i < elementos; i++) {
            for (j = 0; j < elementos; j++) {

                if ((i == 0) || (i == elementos - 1)) {

                    System.out.print("*");

                } else if (j == 0 || j == elementos - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}

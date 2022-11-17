/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.

Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
import java.util.Scanner;

/**
 *
 * @author msabella
 */

public class Ejercicio23_extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        boolean condicion;
        int indice;
        int posicion;
        String testeo;
        boolean estado;
        String[][] matriz = new String[20][20];
        for (int i = 0; i < 5; i++) {

            do {
                condicion = false;
                System.out.println("ingrese palabra número: " + (i + 1));
                palabra = leer.next();
                if (((palabra.length()) < 3) || ((palabra.length()) > 5)) {
                    System.out.println("La palabra ingresada debe ser de entre 3 a 5 caracteres. ");
                    condicion = true;
                }

            } while (condicion == true);
            
            posicion = (int) (Math.random()*19);
            
            for (int j = posicion; j < 19; j++) {
                if (matriz[posicion][j] == "0") {
                    estado = true;
                }else {
                estado = false;
                break;
            }
                if (palabra.length()> ) {
                    
                }
                for (int columna = ; columna < palabra.length(); columna++) {
                    
                        
                    
                    matriz[posicion][k]=palabra
                }
  
                
            }
            
            if (matriz [posicion][1] == "0"){
                
                rellenarMatriz(matriz, posicion);
                
            }
            
           
                
            }
                  
         
                
            }
    public static void rellenarMatriz(String[][] matriz, int posicion) {
     
            
               
            }
            
}
    



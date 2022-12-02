/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. 

En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. 

Deberá además implementar los siguientes métodos:

a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.

b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
 Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.

f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.

g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.

h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package guia7_ejercicio8;

import PaqueteCadena.Cadena;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia7_Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase;
        Cadena C1 = new Cadena();

        System.out.println("Ingrese una frase o palabra: ");
        C1.setFrase(leer.next());
        C1.setLongitudFrase(C1.getFrase().length());

        System.out.println("Iingrese la opción que desea ejecutar");
        System.out.println("1- Mostrar vocales");
        System.out.println("2- Invertir frase");
        System.out.println("3- Mostrar veces que se repite una letra");
        System.out.println("4- Comparar longitud con una nueva frase.");
        System.out.println("5- Unir con nueva frase");
        System.out.println("6- Reemplazar las a por una letra");
        System.out.println("7- Ver si contiene una letra especifica");

        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                mostrarVocales(C1);
                break;
            case 2:
                invertirFrase(C1);
                break;
            case 3:
                vecesRepetido(C1);
                break;
            case 4:
                compararLongitud(C1);
                break;
            case 5:
                unirFrases(C1);
                break;
            case 6:
                reemplazar(C1);
                break;
            case 7:
                contiene(C1);
                break;
            default:
                throw new AssertionError();
        }

    }

    public static void mostrarVocales(Cadena C1) {

        int contador = 0;
        for (int i = 0; i < C1.getLongitudFrase(); i++) {

            if ("a".equalsIgnoreCase(C1.getFrase().substring(i, i + 1)) || "e".equalsIgnoreCase(C1.getFrase().substring(i, i + 1)) || "i".equalsIgnoreCase(C1.getFrase().substring(i, i + 1)) || "o".equalsIgnoreCase(C1.getFrase().substring(i, i + 1)) || "u".equalsIgnoreCase(C1.getFrase().substring(i, i + 1))) {
                contador++;
            }
        }

        System.out.println("Su frase contiene " + contador + " vocales.");
    }

    public static void invertirFrase(Cadena C1) {

        String cadenaInvertida = "";
        for (int i = C1.getLongitudFrase() - 1; i >= 0; i--) {
            cadenaInvertida = cadenaInvertida + C1.getFrase().charAt(i);
        }
        System.out.println("Su frase invertida es: " + cadenaInvertida);
    }

    public static void vecesRepetido(Cadena C1) {
        System.out.println("Ingrese letra que desea buscar en la frase.");
        String letra = leer.next();
        int contadorLetra = 0;

        for (int i = 0; i < C1.getLongitudFrase(); i++) {
            if (C1.getFrase().substring(i, i + 1).equals(letra)) {
                contadorLetra++;
            }
        }

        System.out.println("La letra " + letra + " se repite " + contadorLetra + " veces.");

    }

    public static void compararLongitud(Cadena C1) {
        System.out.println("Ingrese frase para comprar longitud.");
        String frase2 = leer.next();
        int opc;
        if (C1.getFrase().length() == frase2.length()) {
            opc = 0;
        } else {
            if (C1.getFrase().length() < frase2.length()) {
                opc = 1;
            } else {
                opc = -1;
            }
        }

        switch (opc) {
            case 1:
                System.out.println("La frase ingresada es de mayor longitud");
                break;
            case 0:
                System.out.println("Las frases son de igual longitud");
                break;
            case -1:
                System.out.println("La frase ingresada es de menor longitud");
                break;
            default:
                throw new AssertionError();
        }

    }

    public static void unirFrases(Cadena C1) {
        System.out.println("Ingrese frase para unir");
        String fraseUnir = leer.next();
        System.out.println("Su nueva frase es: " + C1.getFrase().concat(" ").concat(fraseUnir));

    }

    public static void reemplazar(Cadena C1) {
        System.out.println("Ingrese letra con la cual desea reemplazar las 'a'");
        String letraCambiarA = leer.next();
        for (int i = 0; i < C1.getLongitudFrase(); i++) {
            if (C1.getFrase().substring(i,i+1).equalsIgnoreCase("a")) {
                C1.setFrase(C1.getFrase().replace("a", letraCambiarA));
            }
        }
        System.out.println("La nueva frase es "+C1.getFrase());
    }

    public static void contiene(Cadena C1) {
        System.out.println("Ingrese letra para ver si exite en la frase guardada");
        String comprobacionPalabra=leer.next();
        int contadorDeLetra=0;
        for (int i = 0; i <C1.getLongitudFrase(); i++) {
            if (C1.getFrase().substring(i, i+1).equalsIgnoreCase(comprobacionPalabra)) {
                contadorDeLetra++;
            }
        }
        
        if (contadorDeLetra==0) {
            System.out.println("El caracter ingresado no se encuentra en la frase guardada");
        }else{
            System.out.println("El caracter "+'"'+comprobacionPalabra+'"'+" se encuentra "+contadorDeLetra+" veces en la frase guardada.");
        }
    }

}

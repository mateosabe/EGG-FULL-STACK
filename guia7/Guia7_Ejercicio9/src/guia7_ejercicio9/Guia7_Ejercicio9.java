/*
Método Static y Clase Math

9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor

b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.

c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package guia7_ejercicio9;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia7_Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Matematica m1 = new Matematica();
        m1.setNum1((int) (Math.random() * 100));
        m1.setNum2((int) (Math.random() * 100));

        //System.out.println("Ingrse la opcion que desee ejecutar");
        //int opcion = leer.nextInt();
        //switch (opcion) {
        // case 1:
        int mayor = devolverMayor(m1);
        //   break;
        //case 2:
        calcularPotencia(mayor, m1);
        //  break;
        //case 3:
        calcularRaiz(mayor, m1);
        //  break;
        //default:
        //  throw new AssertionError();
    }

    public static int devolverMayor(Matematica objeto) {
        if (objeto.getNum1() > objeto.getNum2()) {
            System.out.println("El valor mas grande es el de " + objeto.getNum1() + " que pertenece al atributo numero 1");
            return objeto.getNum1();

        } else {
            System.out.println("El valor mas frande es el de " + objeto.getNum2() + " que pertenece al atributo numero 2");
            return objeto.getNum2();

        }
    }

    public static void calcularPotencia(int mayor, Matematica objeto) {
        if (mayor == objeto.getNum1()) {
            System.out.println("La potencia del numero mayor: "+ mayor+" elevado al menor "+ objeto.getNum2()+" es: " + Math.pow(mayor, objeto.getNum2()));
        } else {
            System.out.println("La potencia del numero mayor: "+ mayor+" elevado al menor "+ objeto.getNum1()+" es: " + Math.pow(mayor, objeto.getNum1()));
        }

    }

    public static void calcularRaiz(int mayor, Matematica objeto) {
        int valorAbsoluto;
        if (mayor == objeto.getNum1()) {
            valorAbsoluto=(int) Math.sqrt(objeto.getNum2());
            System.out.println("La raiz cuadrada del número menor absoluto: "+valorAbsoluto+" es: " + Math.sqrt(valorAbsoluto));
        } else {
             valorAbsoluto=(int) Math.sqrt(objeto.getNum1());
            System.out.println("La raiz cuadrada del número menor absoluto: "+valorAbsoluto+" es: " + Math.sqrt(valorAbsoluto));
        }
    }
}

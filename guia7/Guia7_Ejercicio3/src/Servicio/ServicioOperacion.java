package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author msabella
 */
public class ServicioOperacion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion(Operacion S1) {

        Operacion OP = new Operacion();
        System.out.println("Ingrese número 1: ");
        OP.setNumero1(leer.nextInt());
        System.out.println("Ingrese número 2: ");
        OP.setNumero2(leer.nextInt());
        return OP;

    }

    
    public int sumar(Operacion OP){
        return OP.getNumero1() + OP.getNumero2();
    }
    public int restar(Operacion OP) {
        return OP.getNumero1() - OP.getNumero2();
    }
    public int multiplicar(Operacion OP) {
        if (OP.getNumero1()==0 || OP.getNumero2()==0) {
            System.out.println("ERROR, La multiplicación 0");
        }
        return OP.getNumero1() * OP.getNumero2();
    }
    public int dividir(Operacion OP) {
        if (OP.getNumero1()==0 || OP.getNumero2() == 0) {
            System.out.println("Error, el division es 0");
        }
        return OP.getNumero1() / OP.getNumero2();
    }

}

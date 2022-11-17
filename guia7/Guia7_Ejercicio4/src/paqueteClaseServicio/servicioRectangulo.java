/*
 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package paqueteClaseServicio;

import java.util.Scanner;
import paqueteEntidad.rectangulo;

/**
 *
 * @author msabella
 */
public class servicioRectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public rectangulo crearRectangulo() {

        rectangulo R = new rectangulo();
        System.out.println("Ingrese base de su rectangulo: ");
        R.setBase(leer.nextInt());
        System.out.println("Ingrese altura de su rectangulo");
        R.setAltura(leer.nextInt());
        return R;
    }
    
     public void mostrarRectangulo(rectangulo R){
            for (int i = 0; i < R.getBase(); i++) {
                for (int j = 0; j < R.getAltura(); j++) {
                    
                    if (i==0 || i==(R.getBase()-1) || j==0 || j==(R.getAltura()-1)) {
                        System.out.print(" * ");
                        
                    }else{
                        System.out.print("   ");
                    }
                    
                }
              System.out.println("");
         }
           
        }
     
     public void calcularSuperficieRectangulo(rectangulo R){
         System.out.println("La superficie del rectangulo con las base: "+R.getBase()+" y la arltura: "+R.getAltura()+ " es: " +R.getBase()*R.getAltura());
     }
     public void calcularPerimetroRectangulo(rectangulo R){
         System.out.println("El perimetro del rectangulo con las base: "+R.getBase()+" y la arltura: "+R.getAltura()+ " es: " +(R.getBase()+R.getAltura())*2);
     }
     
}
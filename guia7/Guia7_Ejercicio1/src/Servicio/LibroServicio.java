
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class LibroServicio {
    
    
    
    public Libro CargarLibro (){
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese ISBM del libro: ");
        String ISBM  = leer.next();
        
        System.out.println("Ingrese titulo del libro: ");
        String Titulo  = leer.next();
        
        System.out.println("Ingrese Nombre del autor del libro: ");
        String Autor  = leer.next();
        
        System.out.println("Ingrese numero de páginas del libro: ");
        int Paginas = leer.nextInt();
     
        return new Libro(ISBM, Titulo, Autor, Paginas);
    } 
    
}

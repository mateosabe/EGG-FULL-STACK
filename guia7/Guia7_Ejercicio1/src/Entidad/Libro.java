/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author mateo
 */
public class Libro {
    private String ISBM;
    private String Titulo;
    private String Autor;
    private int Pagina;

    public Libro(String ISBM, String Titulo, String Autor, int Pagina) {
        this.ISBM = ISBM;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Pagina = Pagina;
    }

    public Libro() {
        
    }

    public String getISBM() {
        return ISBM;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getPagina() {
        return Pagina;
    }

    public void setISBM(String ISBM) {
        this.ISBM = ISBM;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setPagina(int Pagina) {
        this.Pagina = Pagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBM=" + ISBM + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Pagina=" + Pagina + '}';
    }
    

}

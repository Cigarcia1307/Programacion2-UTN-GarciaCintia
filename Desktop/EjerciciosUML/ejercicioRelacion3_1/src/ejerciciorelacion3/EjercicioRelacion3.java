/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorelacion3;

/**
 *
 * @author HP
 */
public class EjercicioRelacion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Editorial editorial =new Editorial (" Suma ", "Suipacha 123");
        Autor autor = new Autor(" Florencia Bonelli ", " Argentina");
        Libro libro=new Libro ("Caballos de fuego ", " A1024 ");
      
        libro.setAutor(autor);
        libro.setEditorial(editorial);
    
        libro.mostrarAutor();
    }
    
}

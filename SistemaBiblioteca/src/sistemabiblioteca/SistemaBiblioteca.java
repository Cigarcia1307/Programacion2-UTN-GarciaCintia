/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemabiblioteca;


/**
 
 * 
 */
public class SistemaBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Biblioteca miBiblioteca = new Biblioteca("Biblioteca Principal");
         Autor autor1= new Autor ("A001", "Isabel Allende", "Chilena");
         Autor autor2= new Autor ("A002", "Florencia Bonelli", "Argentina");
         Autor autor3= new Autor ("A003", "Gabriel Rolon ", "Argentino");
         
         Libro libro1=new Libro ("ISBN01" , "La casa de los espiritus", 1982, autor1);
         Libro libro2=new Libro ("ISBN02" , "Caballos de fuego", 2011, autor2);
         Libro libro3=new Libro ("ISBN03" , "Indias Blancas", 2005, autor2);
         Libro libro4=new Libro ("ISBN04" , "Los padecientes", 2011, autor3);
         Libro libro5=new Libro ("ISBN05" , "La Felicidad", 2023, autor2);

        System.out.println("Biblioteca creda exitosamente " + miBiblioteca.getNombre());
        System.out.println("Autores Creados:");
        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();
        
        System.out.println("Libros creados:");
        libro1.mostrarInfo();
        libro2.mostrarInfo();
        libro3.mostrarInfo();
        libro4.mostrarInfo();
        libro5.mostrarInfo();
        
        
        miBiblioteca.agregarLibro(libro1);
        miBiblioteca.agregarLibro(libro2);
        miBiblioteca.agregarLibro(libro3);
        miBiblioteca.agregarLibro(libro4);
        miBiblioteca.agregarLibro(libro5);
        System.out.println("Listado de libros:");
        miBiblioteca.listarLibros();
        
        Libro buscado= miBiblioteca.buscarLibroPorIsbn("ISBN01");
        if (buscado != null){
            System.out.println("Libro encontrado:");
        }else{
            System.out.println("Libro no encontrado");
    
        boolean eliminado= miBiblioteca.eliminarLibro("ISBN01");
            if(eliminado){
            System.out.println("Libro eliminado correctamente:");
        }else{
        System.out.println("No se encontro el libro para elimiar");
    }
         
    }
   } 
}

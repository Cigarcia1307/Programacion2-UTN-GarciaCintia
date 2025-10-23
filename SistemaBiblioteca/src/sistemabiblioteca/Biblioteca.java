/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros =new ArrayList<>();
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    public void mostrarLibro(){
        System.out.println("Biblioteca:"+ nombre);
        for(Libro libro : libros){ 
            libro.mostrarInfo();
            
        }
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void agregarLibro(String isbn,String titulo,  int anioPublicacion, Autor autor){
        Libro nuevoLibro= new Libro(isbn,titulo,anioPublicacion, autor);
        libros.add(nuevoLibro);
    }
       public void listarLibros(){
        for (Libro libro :libros){
            libro.mostrarInfo();
        }
    } 
    public Libro buscarLibroPorIsbn (String isbn){
        for(Libro libro :libros){
            if (libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
      
        return null;
    }
    public boolean eliminarLibro(String isbn) {
        for (Libro libro:libros){
            if(libro.getIsbn().equals(isbn)){
                libros.remove(libro);
                return true;
                
            }
        }
        return false;
    }
    
}

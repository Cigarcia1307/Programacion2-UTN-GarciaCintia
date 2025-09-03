/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author HP
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    
    public String getTitulo(){
        return titulo;
    }    
    
    public String getAutor(){
       return autor;
    }
    
    public int getAnioPublicacion(){
        return anioPublicacion;
    }
    public void setTitulo(String nuevoTitulo) {
        titulo = nuevoTitulo;
    }

    public void setAutor(String nuevoAutor) {
        autor = nuevoAutor;
    }



    public void setAnioPublicacion(int anioNuevo){
        if (anioNuevo  >= 1500 && anioNuevo <=2025){
            anioPublicacion = anioNuevo;
        }else {
            System.out.println("Anio Invalido, debe estar entre 1990 y 2015.");
        }
    }
     public void mostrarInfo(){
         System.out.println("Titulo: " + titulo);
         System.out.println("Autor: " + autor);
         System.out.println("Anio de publicacion: " + anioPublicacion);
    }  
}

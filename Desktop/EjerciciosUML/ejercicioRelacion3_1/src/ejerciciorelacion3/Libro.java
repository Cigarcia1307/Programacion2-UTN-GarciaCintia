/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion3;

/**
 *
 * @author HP
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor; //asociacion 1 a 1
    private Editorial editorial;//agregacion

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    public void setAutor (Autor autor){
        this.autor = autor;
        
    }
    public void mostrarAutor(){
        if(autor != null){
            System.out.println(titulo +  isbn + "el autor es:" + autor.getNombre() + ",de nacionalidad " + autor.getNacionalidad());
        }
         if (editorial != null) {
            System.out.println("Editorial: " + editorial.getNombre() + " (" + editorial.getDireccion() + ")");
        }


        }
    }


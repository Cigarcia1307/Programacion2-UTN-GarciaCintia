/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

/**
 . Encapsulamiento con la Clase Libro
a. Crear una clase Libro con atributos privados: titulo, autor,
añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación
para añoPublicacion.
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con
uno válido, mostrar la información final.

 */
public class Ejercicio3Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro = new Libro ();
        
        libro.setAutor("Florencia Bonelli");
        libro.setTitulo("Caballos de Fuego");
        libro.setAnioPublicacion(2000);
        
        libro.mostrarInfo();
        libro.setAnioPublicacion(1400);
        
        
       


    }
        
    }
    

   



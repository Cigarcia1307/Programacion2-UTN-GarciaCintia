/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import ejercicio1.Estudiante;


/**
 *
 * @author HP
 */
public class PrincipalEstudianteEjercicio1 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Estudiante alumno = new Estudiante();
      
        alumno.nombre = " Pedro ";
        alumno.apellido = " Gomez ";
        alumno.curso = " Programacion ";
      
        alumno.mostrarInfo();
       
        System.out.println("Su nota actual es:" + alumno.obtenerCalificacion());
        alumno.aumentar(1.00);
        System.out.println("La nota subio:" + alumno.obtenerCalificacion());
        alumno.bajar(0.5);
        System.out.println("La nota bajo:" + alumno.obtenerCalificacion());
      
} 
        
    }
    
 

 
   

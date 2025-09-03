/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionpooparte1;

/**
 *
 * @author HP
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
   void  mostrarInfo (){
        System.out.println("Su nombre es: " + nombre + " " +  apellido + " " + "cursa:" + curso);
   }
   
   
    double obtenerCalificacion(){
        return calificacion;
    }
     void aumentar( double nota){
        calificacion += nota;
   }
     void bajar (double nota){
         calificacion -=nota;
     }
}
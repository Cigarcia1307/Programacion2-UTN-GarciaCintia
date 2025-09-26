/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion9;

/**
 *
 * @author HP
 */
public class Profesional {
    private String nombre;
    private String especialidad;
  

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    
        
    
    public void mostrarDatos(){
       System.out.println("El profesional: " + nombre + " especialidad " + especialidad );
        
    }
}

    
    


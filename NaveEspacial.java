/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author HP
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private boolean despegue;
     
    public NaveEspacial(){
        combustible=50;
        despegue= false;
    }
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre; 
    }
    public void despegar(){
         despegue  = true;
         System.out.println( nombre + " despego!");
    } 
     public void avanzar(int distancia){
         if (despegue){
            if (combustible >= distancia){
                 System.out.println(nombre + "avanza "+ distancia + "km");
                 combustible =distancia;
                 
            }else {System.out.println("No hay suficiente combustible");
                    
         }
        }else {
             System.out.println("La nave "+ nombre + " aun no despego");
        }
     
     }
     public void recargarCombustible(int cantidad){
        if (cantidad + combustible <= 100){
            combustible += cantidad;
            System.out.println("Recarga " + cantidad + "litros de combustible completa");
        } else {
            System.out.println("La cantidad que desea cargar excede el limite maximo");
        }
     }
     
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + " unidades");
    }  
    
}
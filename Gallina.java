/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author HP
 */
public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;
    
    public String getIdGallina (){
        return idGallina;
    }
    public void setIdGallina(String nuevoId) {
    idGallina = nuevoId;
}


    public int getEdad (){
        return edad;
    }
    public int getHuevosPuestos(){
        return huevosPuestos;
        
    }
    public void setEdad(int nuevaEdad){
        if (nuevaEdad >= 0){
            edad = nuevaEdad;
        } else {
            System.out.println("Edad invalida");
        }
    }
    public void ponerHuevo(){
        huevosPuestos++;
    }
    public void envejecer(){
        edad++;
    }
     public void mostrarEstado() {
        System.out.println("Gallina: " + idGallina);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("-----------------------------");

     }
}

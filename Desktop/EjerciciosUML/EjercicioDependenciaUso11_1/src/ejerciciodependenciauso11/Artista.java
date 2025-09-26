/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodependenciauso11;

/**
 *
 * @author HP
 */
public class Artista {
    private String nombre;
    private String genero;
    private Cancion cancion;// asociacion 1a1

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
    
    public void setCancion (Cancion cancion){
        this.cancion= cancion;
        
    }
    public void mostrarCancion (){
        if (cancion !=null){
            System.out.println("La cancion de " + nombre + 
                    "  pertenece al genero " + genero + " se llama: " + cancion.getTitulo());
        } else{
            System.out.println("El cantante " + nombre + 
                    "genero " + genero + "no corresponde a esa cancion");
        }
    }
    
    
}

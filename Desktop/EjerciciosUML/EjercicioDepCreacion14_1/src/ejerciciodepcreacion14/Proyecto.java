/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodepcreacion14;

/**
 *
 * @author HP
 */
public class Proyecto {
    private String nombre;
    private String duracionMin;
    private  Render render;

    public Proyecto(String nombre, String duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }
    
    public void setRender (Render render){
        this.render = render;
        
    }
    
    public void mostrarRender(){
        if (render != null ) {   
            System.out.println("Proyecto" + nombre + " duracion " + duracionMin + 
                    " formato exportado:"  + render.getFormato ());
        }else{
            System.out.println("Proyecto: " + nombre +
                    "duracion "+ duracionMin + " no posee render asociado");
        }
     }

    public String getNombre() {
        return nombre;
    }

    public String getDuracionMin() {
        return duracionMin;
    }
    
}

    


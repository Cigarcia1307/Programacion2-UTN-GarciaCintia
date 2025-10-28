/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package categoriaanimales;

/**
 *
 * @author HP
 */
public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String hacerSonido(){
        return "Sonido especifico";
        
        
    }
    public String describirAnimal(){
        return "Ese animal se llama: " + nombre ;
        
    }
}

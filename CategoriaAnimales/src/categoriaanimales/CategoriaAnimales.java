/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package categoriaanimales;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class CategoriaAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal>animales= new ArrayList<>();
        
        animales.add(new Perro ("Pipo"));
        animales.add(new Gato("Pumba"));
        animales.add(new Vaca ("Milka"));
        
        for (Animal a :animales){
            System.out.println(a.describirAnimal());
            System.out.println("Sonido " + a.hacerSonido());
            System.out.println();
        }
        
        
    }
    
}

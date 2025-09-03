/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Poo.EjercicioGallina;

/**
 *
 * @author HP
 */
public class Ejercicio4Gallina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        gallina1.setIdGallina("juana");
        gallina1.setEdad(4);
        
        gallina2.setIdGallina("Clara");
        gallina2.setEdad(8);
        
        
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();

        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.envejecer();

        // Mostrar estado final
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}


  

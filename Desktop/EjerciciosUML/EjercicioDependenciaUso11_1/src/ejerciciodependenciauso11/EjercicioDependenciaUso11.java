/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciodependenciauso11;

/**
 *
 * @author HP
 */
public class EjercicioDependenciaUso11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion= new Cancion ("El favor");
        Artista artista=new Artista("Las pastillas del abuelo" ,"rock");
        Reproductor reproducir= new Reproductor ();
        
        artista.setCancion(cancion);
        reproducir.reproducir(cancion);
        
        artista.mostrarCancion();
    }
    
}

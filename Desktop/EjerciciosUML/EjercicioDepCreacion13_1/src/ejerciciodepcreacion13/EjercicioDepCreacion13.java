/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciodepcreacion13;

/**
 *
 * @author HP
 */
public class EjercicioDepCreacion13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CodigoQR codigoQr= new CodigoQR ("A4754JILO96");
        Usuario usuario = new Usuario ("Domingo Lopez", " dlopezmingo@gmail.com");
        GeneradorQR generadorQr =new GeneradorQR();
        
        generadorQr.crearYMostrar(usuario.getNombre());
        usuario.setCodigoQR(codigoQr);
        usuario.mostrarCodigoQR();
        
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorelacion1;

/**
 *
 * @author HP
 */
public class EjercicioRelacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pasaporte pasaporte1 = new Pasaporte(1234 , 14 , " foto1.jpg ", " jpeg ");
        Titular titular1 = new Titular("Cintia", 12345678, pasaporte1);
        pasaporte1.mostrarFoto();
        
     

    }
    
  


    
}

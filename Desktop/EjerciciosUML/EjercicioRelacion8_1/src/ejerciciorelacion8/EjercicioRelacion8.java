/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorelacion8;

/**
 *
 * @author HP
 */
public class EjercicioRelacion8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Usuario cliente=new Usuario ("Juan Perez", "jperez123@gmail.com");
        
        Documento documento1= new Documento("Documento", "prestamo", "cod254185", "25/10/2020");
        documento1.getFirmaDigital().setUsuario(cliente);
        
        documento1.mostrarFirmaDigital();
        documento1.mostrarUsuario();

        
    }
    
}

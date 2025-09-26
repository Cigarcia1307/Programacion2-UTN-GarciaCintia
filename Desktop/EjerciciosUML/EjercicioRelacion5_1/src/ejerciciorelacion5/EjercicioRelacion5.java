/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorelacion5;

/**
 *
 * @author HP
 */
public class EjercicioRelacion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora notebook =new Computadora ("HP ", "10244254758","HP5847415", "1254MP");
        Propietario propietario = new Propietario("Alejandro Fernandez", "26065874");
        notebook.mostrarPlacaMadre();
        notebook.setPropietario(propietario);
        notebook.mostrarPropietario();

    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciodepuso12;

/**
 *
 * @author HP
 */
public class EjercicioDepUso12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Impuesto impuesto=new Impuesto("25000");
        Contribuyente contribuyente= new Contribuyente("Carlos Noir", "23205698567");
        Calculadora calcularMonto=new Calculadora();
        
        contribuyente.setImpuesto(impuesto);
        contribuyente.mostrarImpuesto();
    }
    
}

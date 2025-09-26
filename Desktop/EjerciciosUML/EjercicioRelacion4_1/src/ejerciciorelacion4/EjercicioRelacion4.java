/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorelacion4;

/**
 *
 * @author HP
 */
public class EjercicioRelacion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TarjetaCredito tarjetaCredito = new TarjetaCredito("459652145287", "10/20");
        Banco banco= new Banco ("Santander", "2005874521");
        
        tarjetaCredito.setBanco(banco);
        tarjetaCredito.mostrarInfo();
    }
    
}

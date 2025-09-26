/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorelacion10;

/**
 *
 * @author HP
 */
public class EjercicioRelacion10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular titular1= new Titular("Eliana Gomez", "20658963");
        CuentaBancaria cuentaBancaria= new CuentaBancaria("007209654874512", "200", "2547", "25-08-1998");
        
        titular1.setCuentaBancaria(cuentaBancaria);
        cuentaBancaria.mostrarDatos();
       
    }
    
}

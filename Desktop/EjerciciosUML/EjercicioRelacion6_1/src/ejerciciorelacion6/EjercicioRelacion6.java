/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorelacion6;

/**
 *
 * @author HP
 */
public class EjercicioRelacion6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mesa mesa =new Mesa ("1","5");
        Reserva reserva= new Reserva ("25/10/2025 ", " 22.00", mesa);
        Cliente cliente= new Cliente("Oscar Longo ","065859");
        cliente.setReserva(reserva);
        cliente.mostrarReserva();
        reserva.mostrarMesa();
    }
    
}

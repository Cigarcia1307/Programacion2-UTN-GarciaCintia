/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion6;

/**
 *
 * @author HP
 */
public class Cliente {
    private String nombre;
    private String dni;
    private Reserva reserva; // asociacion 1 a 1

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setReserva(Reserva reserva){
        this.reserva = reserva;
    }
    public  Reserva getReserva(){
        return reserva;
    }
    
    public void mostrarReserva(){
        if (reserva != null ){
            System.out.println("El cliente " + nombre + "numero de DNI:" + dni + " tiene una reserva el dia " + reserva.getFecha() + "a las:" + reserva.getHora()+ " horas ");
           
        }else {
            System.out.println("El cliente " + nombre + "numero de DNI:" + dni + "no posee reserva");
        }
    }
    
    
}

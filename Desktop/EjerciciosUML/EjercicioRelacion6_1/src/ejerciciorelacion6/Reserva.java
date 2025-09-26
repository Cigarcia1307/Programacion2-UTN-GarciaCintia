/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion6;

/**
 *
 * @author HP
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Mesa mesa;//agregacion

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }
    
    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
    public void mostrarMesa(){
        System.out.println("en la fecha: " + fecha + "hora: "+ hora + "tiene la mesa " + mesa.getNumero() + "con capacidad: "+ mesa.getCapacidad()   );
    }

    
    
    
}

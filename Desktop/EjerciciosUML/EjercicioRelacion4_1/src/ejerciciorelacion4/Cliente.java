/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion4;

/**
 *
 * @author HP
 */
public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaCredito tarjetaCredito;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
    
    
    
}

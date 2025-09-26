/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion7;

/**
 *
 * @author HP
 */
public class Motor {
    private String numeroSerie;
    private String tipo;
    private Vehiculo vehiculo;

    public Motor(String numeroSerie, String tipo) {
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;

    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getMotor() != this) {
            vehiculo.setMotor(this);
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}


    
    
    
    
    


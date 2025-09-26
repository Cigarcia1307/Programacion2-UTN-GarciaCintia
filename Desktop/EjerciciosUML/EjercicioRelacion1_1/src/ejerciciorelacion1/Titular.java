/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion1;

/**
 *
 * @author HP
 */
public class Titular {
    private String nombre;
    private int dni;
    private Pasaporte pasaporte; //referencia al pasaporte asociado

    public Titular(String nombre, int dni, Pasaporte pasaporte) {
        this.nombre = nombre;
        this.dni = dni;
        this.pasaporte = pasaporte;
        pasaporte.setTitular(this);
    }
 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }
    
    
}

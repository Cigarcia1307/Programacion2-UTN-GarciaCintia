/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleadocategoria;

/**
 *
 * @author HP
 */
public class EmpleadoTemporal extends Empleado{
    private final int horasTrabajadas;
    private final int valorHora;

    public EmpleadoTemporal(int horasTrabajadas, int valorHora, String nombre) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
    
    
    
    
}

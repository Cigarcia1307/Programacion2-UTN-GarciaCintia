/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleadocategoria;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class EmpleadoCategoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta (5800.00 , "Juan"));
        empleados.add(new EmpleadoTemporal(4,4500, "Rocio"));
        
        for (Empleado e : empleados){
            System.out.println("Empleado: "+ e.getNombre());
            System.out.println("Sueldo: "+ e.calcularSueldo());
            
            if (e instanceof EmpleadoPlanta){
                System.out.println("Tipo: Planta Permanente");
                
            }else if(!(e instanceof EmpleadoTemporal)){
            } else {
                System.out.println("tipo: temporal");
            }
        }
    }
    
}

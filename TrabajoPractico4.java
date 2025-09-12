/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

/**
 *
 * @author HP
 */
public class TrabajoPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, " Ana Lopez "," Analista de datos ", 4500.00 );
        
         Empleado empleado2 = new Empleado(" Benjamin Perez "," Analista de Sistema " );
         Empleado empleado3 = new Empleado(" Clara Puerta "," Programadora ");
         
         empleado1.actualizarSalario(10.0);
         empleado2.actualizarSalario(5000);
         
         
         System.out.println(empleado1);
         System.out.println(empleado2);
         System.out.println(empleado3);
         
         System.out.println("Total de empleados " + Empleado.mostrarTotalEmpleados());
         
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorelacion7;

/**
 *
 * @author HP
 */
public class EjercicioRelacion7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor =new Motor (" v8 ",  " naftero ");
        Vehiculo vehiculo = new Vehiculo (" AF859HC " , " Cadilac ", motor);
        Conductor conductor =new Conductor("Osvaldo Rios" ," A273635");
        
        vehiculo.mostrarMotor();
        conductor.setVehiculo(vehiculo);
        
         System.out.println("El conductor " + conductor.getNombre() + " licencia " + conductor.getLicencia());
    }
}


    
    


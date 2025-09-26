/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorelacion9;

/**
 *
 * @author HP
 */
public class EjercicioRelacion9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Paciente paciente1=new Paciente ("Ricardo Jaime ", "Osde");
        Profesional profesional1= new Profesional ("Laura Lopez", "Odontologa");
        
        CitaMedica cita =new CitaMedica("24/08/2024", "8.00", paciente1, profesional1);
        cita.mostrarCita();
        
    }
}        
      
    


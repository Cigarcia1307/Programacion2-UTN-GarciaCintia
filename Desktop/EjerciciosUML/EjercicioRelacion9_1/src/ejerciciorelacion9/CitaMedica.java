/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion9;

/**
 *
 * @author HP
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;         // Asociación unidireccional
    private Profesional profesional;   // Asociación unidireccional




    public CitaMedica(String fecha, String hora,Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente= paciente;
        this.profesional=profesional;
        
    }

    public void mostrarCita() {
    System.out.println("Cita Medica: " + fecha + " a las " + hora);
    if (paciente != null) {
        paciente.mostrarDatos();
    } else {
        System.out.println("Paciente no asignado.");
    }

    if (profesional != null) {
        profesional.mostrarDatos();
    } else {
        System.out.println("Profesional no asignado.");
    }
}


}


    
    
    
    


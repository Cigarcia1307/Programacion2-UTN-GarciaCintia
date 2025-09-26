/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion7;

/**
 *
 * @author HP
 */
public class Vehiculo {
    private  String patente;
    private  String modelo;
    private  Motor motor;//agregacion
    private Conductor conductor;//Asocicaion

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void mostrarMotor(){
        if (motor!=null){
            System.out.println(" La patente: " + patente + " modelo " +  modelo + 
                    " tiene un motor con numero de serie"  + motor.getNumeroSerie()
                    + " tipo " + motor.getTipo());
        }else{
            System.out.println(" La patente: " + patente + " modelo " +  modelo + " no tiene motor.");
        }   
    } 
    public void setMotor (Motor motor){
        this.motor =motor;
        if(motor !=null && motor.getVehiculo() != this){
           motor.setVehiculo(this);
        }
    }
            
        public Motor getMotor() {
        return motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    public Conductor getConductor() {
        return conductor;
    }
}


    
    

    







    

 
  
    
    


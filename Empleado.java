/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author HP
 */
public class Empleado {
    private int id; //Identificador único del empleado
    private String nombre;// Nombre completo
    private String puesto;//Cargo que desempeña
    private double salario;// Salario actual
    private static int totalEmpleados = 0; //Contador global de empleados creados
    
    //generador de id
    private static int contadorId= 1000;
    
    //constructor
    public Empleado (int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario= salario;
        totalEmpleados ++;
    }
    
    //CONSTRUCTIR SOBRECRAGADO
    public Empleado(String nombre, String puesto){
        this.id = contadorId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 4500.00;
        totalEmpleados ++;
      }
     public void actualizarSalario(double porcentaje){
         if (porcentaje > 0){
             this.salario += this.salario * (porcentaje / 100);
             
         }
     }
      public void actualizarSalario( int aumentoFijo){
         if (aumentoFijo > 0){
             this.salario += aumentoFijo;
             
         }
     }
      @Override
        public String toString() {
            return "Empleado [ id = " + id + ", Nombre = " + nombre + ", Puesto = " + puesto + ", Salario = " + salario + " ] ";
        }
        public static  int mostrarTotalEmpleados (){
            return totalEmpleados;
        }
        public int getId(){
            return id;
        }
        public  String getNombre(){
            return nombre;
            
        }
        public String getPuesto(){
            return puesto;
        }
        public double getSalario(){
            return salario;
            
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
           
        }
        public void setPuesto(String puesto){
            this.puesto = puesto;
           
        }
        public void setSalario(double salario){
            this.salario = salario;
           
        }
}       


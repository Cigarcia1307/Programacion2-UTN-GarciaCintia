/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodepuso12;

/**
 *
 * @author HP
 */
public class Contribuyente {
    private String nombre;
    private String cuil;
    private Impuesto impuesto;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public void setImpuesto(Impuesto impuesto) {
        this.impuesto = impuesto;
    }
    
    public void mostrarImpuesto (){
        if (impuesto !=null){
            System.out.println("El cliente: " + nombre + "cuil " 
                    + cuil + "abona:" + impuesto.getMonto());
        }else{
            System.out.println("El cliente: " + nombre + "cuil " 
                    + cuil + "no abona impuesto");
        }
    }
}

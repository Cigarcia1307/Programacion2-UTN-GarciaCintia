/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion5;

/**
 *
 * @author HP
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; //composicion 1a1
    private Propietario propietario;//asociacion bidireccional

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }

    public void mostrarPlacaMadre(){
        System.out.println("La computadora: " + marca + " numero de serie :" + numeroSerie + " pertenece al modelo SERIE:" + placaMadre.getModelo() + " y numero de chipset:" + placaMadre.getChipset() );
    }
    
    public void setPropietario (Propietario propietario){
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora (this);
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void mostrarPropietario(){
        if (propietario !=null){
            System.out.println("Popietario: " + propietario.getNombre() + "numero DNI:" + propietario.getDni());
        }else{
            System.out.println("Esa computadora no tiene porpietario");
        }
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion2;

/**
 *
 * @author HP
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;//agregacion 1a1
    private Usuario usuario;//asociacion bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    public void setBateria(Bateria bateria){
        this.bateria =bateria;
        
    }
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Usuario getUsuario() {
        return usuario;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() !=this){
            usuario.setCelular(this);
        }
    }
    public void mostrarInfo() {
        System.out.println("Informacion del Celular:");
        System.out.println("  IMEI: " + this.imei);
        System.out.println("  Marca: " + this.marca);
        System.out.println("  Modelo: " + this.modelo);
        
        // Verificamos si hay una batería asociada para evitar un Null
        if (this.bateria != null) {
            System.out.println("  Bateria: " + this.bateria.getModelo() + " con " + this.bateria.getCapacidad() + " porcentaje ");
        } else {
            System.out.println("  Este celular no tiene una bateria asociada.");
        }
    }
}

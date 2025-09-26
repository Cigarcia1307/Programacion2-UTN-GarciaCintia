/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion1;

/**
 *
 * @author HP
 */
public class Pasaporte {
    private int numero;
    private int fechaEmision;
    private Foto foto;//composicion 1a1
    private Titular titular;//asociacion bidireccional

    public Pasaporte(int numero, int fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto (imagen, formato);
       
    }
    
    public void mostrarFoto(){
        System.out.println("El pasaporte: " + numero + " fecha de emision " + fechaEmision + " tiene la imagen " + foto.getImagen() + " formato " + foto.getFormato());
        
    }

    public Pasaporte(Titular titular) {
        this.titular = titular;
    }
  

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public Titular getTitular() {
        return titular;
    }
}

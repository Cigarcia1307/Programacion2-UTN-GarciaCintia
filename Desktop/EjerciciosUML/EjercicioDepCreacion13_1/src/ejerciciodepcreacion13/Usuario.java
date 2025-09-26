/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodepcreacion13;

/**
 *
 * @author HP
 */
public class Usuario {
    private String nombre;
    private String mail;
    private CodigoQR codigoQr;

    public Usuario(String nombre, String mail) {
        this.nombre = nombre;
        this.mail = mail;
    }
    
    public void setCodigoQR (CodigoQR codigoQr){
        this.codigoQr= codigoQr;
        
    }
    
    public void mostrarCodigoQR(){
        if (codigoQr != null ) {   
            System.out.println("Cliente: " + nombre + " ,mail: " + mail + " tiene asociado el siguiente QR:"  + codigoQr.getValor ());
        }else{
            System.out.println("Cliente: " + nombre + "mail: "+ mail + " no posee codigo QR");
        }
     }

    public String getNombre() {
        return nombre;
    }

    public String getMail() {
        return mail;
    }
    
}

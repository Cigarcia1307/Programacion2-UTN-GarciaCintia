/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion8;

/**
 *
 * @author HP
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;// composicion 1 a 1

    public Documento(String titulo, String contenido, String codigoHash, String fecha){
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital= new FirmaDigital (codigoHash, fecha); //se crea internamnete
        
        
    }
    public void mostrarFirmaDigital(){
        System.out.println("El " + titulo + " con el contenido " + contenido + 
                " corresponde al codigo/fecha: "
                + firmaDigital.getCodigoHash() + firmaDigital.getFecha());
    }
    
    public void mostrarUsuario() {
        firmaDigital.mostrarUsuario();
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }


    
   
    
    
    
    
}

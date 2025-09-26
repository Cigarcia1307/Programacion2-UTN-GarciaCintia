/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion8;

/**
 *
 * @author HP
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

   
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public void mostrarUsuario(){
        if(usuario !=null){
            
       
        System.out.println("El codigo: " + codigoHash + 
                "correspondiente a la fecha: " + fecha + 
                "corresponde al usuario:"+ usuario.getNombre ()+ "mail:"+ usuario.getEmail());
         }else{
            System.out.println("El codigo: " + codigoHash + 
                "correspondiente a la fecha: " + fecha + 
                "no corresponde a ningun usuario");
        }
    }
    
}

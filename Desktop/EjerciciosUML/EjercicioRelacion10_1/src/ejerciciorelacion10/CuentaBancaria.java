/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion10;

/**
 *
 * @author HP
 */
public class CuentaBancaria {
    private String cbu;
    private String saldo;
    private ClaveSeguridad claveSeguridad;//composicion
    private Titular titular;//asociacion bidireccional
    

    public CuentaBancaria(String cbu, String saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad =  new ClaveSeguridad(codigo, ultimaModificacion);
        
    }
    
    public void setTitular(Titular titular) {
        this.titular= titular;
        if (titular !=null && titular.getCuentaBancaria() != this){
        titular.setCuentaBancaria(this);
        }
        
    }
    public Titular getTitular() {
         return titular;
    }


    
    public ClaveSeguridad getClaveSeguridad(){
        return claveSeguridad;
    }
    public void mostrarDatos(){    
        System.out.println("El cbu: " + cbu + "tiene un saldo: " + saldo + " posee un codigo:" +
                claveSeguridad.getCodigo() + " y se modifico por ultima vez: " 
                + claveSeguridad.getUltimaModificacion() );
        if(titular != null ){
            System.out.println("Titular:" + titular.getNombre()+ "dni "+ titular.getDni());
        }
    }
    
    
}

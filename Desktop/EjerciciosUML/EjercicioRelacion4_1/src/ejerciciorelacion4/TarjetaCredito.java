/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion4;

/**
 *
 * @author HP
 */
public class TarjetaCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // para la asociación bidireccional
    private Banco banco;     // para la agregación


    public TarjetaCredito(String numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente =cliente;
        if (cliente != null && cliente.getTarjetaCredito() != this){
            cliente.setTarjetaCredito (this);
        }
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void mostrarInfo(){
        System.out.println("Numero de tarjeta: " + numero);
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
    if (banco != null) {
        System.out.println("Banco: " + banco.getNombre() + " - CUIT: " + banco.getCuit());
    } else {
        System.out.println("No tiene banco asignado.");
    }

 
    }
    
}

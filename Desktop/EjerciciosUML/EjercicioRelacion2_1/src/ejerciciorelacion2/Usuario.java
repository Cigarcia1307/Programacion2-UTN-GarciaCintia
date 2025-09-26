/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorelacion2;

/**
 *
 * @author HP
 */
public class Usuario {
    private String nombre;
    private int dni;
    private Celular celular; //referencia al celular asociado

    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
       
    }
    public void setCelular (Celular celular){
        this.celular =celular;
        if(celular != null && celular.getUsuario() != this){
            celular.setUsuario (this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Celular getCelular() {
        return celular;
    }


   
    
}

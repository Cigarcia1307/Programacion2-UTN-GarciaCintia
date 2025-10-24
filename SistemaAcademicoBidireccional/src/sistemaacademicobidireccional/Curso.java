/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademicobidireccional;

/**
 *
 * @author HP
 */
public class Curso {
    private final String codigo;
    private final String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public void setProfesor(Profesor nuevoProfesor) {
         if( this.profesor != null && profesor != nuevoProfesor){
             this.profesor.eliminarCurso(this);
         }
         this.profesor = nuevoProfesor;
         
         if (nuevoProfesor !=null && !nuevoProfesor.getCursos().contains(this)){
             nuevoProfesor.agregarCurso(this);
        }
    }
    public void mostrarInfo(){
        System.out.println("Curso"+ nombre + "codigo" + codigo);
        if (profesor!=null){
            System.out.println("Profesor a cargo:"+ profesor.getNombre());
            
        }else{
            System.out.println("Sin profesor asignado");
            
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademicobidireccional;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Profesor {
    private final String id;
    private final String nombre;
    private final String especialidad;
    private final List<Curso>cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso (Curso c){
        if (!cursos.contains(c)){
            cursos.add(c);
            if(c.getProfesor()!=this){
                c.setProfesor(this);
            }
                
        }
    }
    public void eliminarCurso(Curso c){
        if(cursos.contains(c)){
            cursos.remove(c);
            if(c.getProfesor()==this){
                c.setProfesor(null);
            }
        }
    }    
    public void listarCursos(){
        System.out.println("Cursos dictados por:" + nombre + ":");
        for (Curso c :cursos){
            System.out.println("-"+ c.getCodigo()+":"+ c.getNombre());
            
        }
    }
    public void mostrarInfo(){
        System.out.println("Profesor" + nombre + "ID:" + id + "Especialidad:" + especialidad );
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    

   
}

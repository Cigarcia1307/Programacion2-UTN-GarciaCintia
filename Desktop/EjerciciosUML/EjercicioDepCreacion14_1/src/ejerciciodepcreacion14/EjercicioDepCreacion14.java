/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciodepcreacion14;

/**
 *
 * @author HP
 */
public class EjercicioDepCreacion14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto proyecto=new Proyecto ("Introduccion a Java:" , "5");
        EditorVideo editor=   new EditorVideo();
        editor.crearYExportar("MP4" , proyecto);
    }   
    
}

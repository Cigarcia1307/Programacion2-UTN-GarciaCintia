/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodepcreacion14;

/**
 *
 * @author HP
 */
public class EditorVideo {
     public void crearYExportar(String formato, Proyecto proyecto){
         Render render = new Render(formato);
         proyecto.setRender(render);
         proyecto.mostrarRender();
    

        
        System.out.println("El video es : " + formato);
    
    }   
}
    


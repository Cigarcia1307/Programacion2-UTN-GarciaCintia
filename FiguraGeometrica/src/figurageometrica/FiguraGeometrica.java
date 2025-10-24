/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurageometrica;

/**
 *
 * @author HP
 */
public class FiguraGeometrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura []figuras = new Figura[3];
        
        figuras[0]=new Circulo (4.5,"Circulo numero 1: ");
        figuras[1]=new Circulo (2.5,"Circulo numero 2:");
        figuras[2]= new Rectangulo("Rectangulo:", 8.5 , 2.5);
        
        for (Figura f : figuras){
            System.out.println("Figura" + f.getNombre() );
            System.out.println("Area:" + f.calcularArea());
            System.out.println("-----------------");
        }
        
        
    }
    
}

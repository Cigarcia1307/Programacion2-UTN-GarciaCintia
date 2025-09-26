/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorelacion2;

/**
 *
 * @author HP
 */
public class EjercicioRelacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bateria bateria1 = new Bateria("Bater", 100);
       Celular celular1= new Celular("012345874", "Iphone", "13ProMax",bateria1);
       Usuario usuario= new Usuario("Rafael Perez", 35478956);
       
       celular1.setUsuario(usuario);
       
       celular1.mostrarInfo();
       System.out.println("Usuario asociado: " + usuario.getNombre() + ", DNI: " + usuario.getDni());
       System.out.println("Celular del usuario: " + usuario.getCelular().getMarca() + " " + usuario.getCelular().getModelo());



    }
    
}

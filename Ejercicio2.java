/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 2. Registro de Mascotas
a. Crear una clase Mascota con los atributos: nombre, especie, edad.
Métodos requeridos: mostrarInfo(), cumplirAnios().
Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y
verificar los cambios.
P
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota mascota = new Mascota();
        
        mascota.nombre = "Pipo";
        mascota.especie = "Perro";
        mascota.edad = 15;
        
        mascota.mostrarInfo();
        System.out.println("");
        mascota.cumplirAnios();
        System.out.println(" Su mascota cumplio un anio mas ");
    }
    
}


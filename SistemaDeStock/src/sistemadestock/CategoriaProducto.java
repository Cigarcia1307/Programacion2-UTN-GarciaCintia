/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package sistemadestock;

/**
 *
 * @author HP
 */
public enum CategoriaProducto {
    ALIMENTOS ("Productos Comestibles"),
    ROPA("Prendas de Vestir"),
    ELECTRONICA("Dispositivos Electronicos"),
    HOGAR("Articulos para el Hogar"),;
    private final String descripcion;

    private CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadestock;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author HP
 */
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    public void agregarProducto (Producto p){
        this.productos.add(p);
        System.out.println("Producto: " + p.getNombre() + "agregado");
    }
    public void listarProductos (){
        if(this.productos.isEmpty()){
            System.out.println("El inventario es 0");
        }else {
            System.out.println("LISTA DE PRODUCTOS:");
            for (Producto p :this.productos){
                p.mostrarInfo();
            }
        }
    }
    public Producto buscarProductoPorId(String id){
        for(Producto p: this.productos){
            if (p.getId().equals(id)){
                return p;
            }
            
        }
        return null;
    }
    public void eliminarProducto (String id){
        Producto ProductoAEliminar = buscarProductoPorId(id);
        if (ProductoAEliminar !=null){
            this.productos.remove(ProductoAEliminar);
            System.out.println("Id de producto: " + id + "eliminado");
        }else {
            System.out.println("No se encontro el producto con el id: " + id + "");
        }
    }
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto productoAActualizar = buscarProductoPorId(id);
        if (productoAActualizar != null) {
            productoAActualizar.setCantidad(nuevaCantidad);
            System.out.println("Stock del producto '" + productoAActualizar.getNombre() + "' actualizado a " + nuevaCantidad + ".");
        } else {
            System.out.println("Error: No se encontró ningún producto con ID '" + id + "'.");
        }
        
    }
    public void filtrarPorCategoria (CategoriaProducto categoria){
        System.out.println("PRODUCTOS DE LA CATEGORIA: " + categoria.getDescripcion());
        boolean encontrado= false;
        for (Producto p : this.productos){
            if (p.getCategoria().equals(categoria)){
                p.mostrarInfo();
                encontrado=true;
                
            }
            
        }
        if (!encontrado){
            System.out.println("No se encontraron productos en esta categoria");
        }
    }
    public int obtenerTotalStock(){
        int total=0;
        for(Producto p :this.productos){
            total += p.getCantidad();
        }
        return total;
    }
    public Producto obtenerProductoConMayorStock(){
        if (this.productos.isEmpty()){
            return null;
        }
        Producto productoMayorStock = this.productos.get(0);
            for (int i = 1; i < this.productos.size(); i++) {
                if(this.productos.get(i).getCantidad()>productoMayorStock.getCantidad()){
                    productoMayorStock =this.productos.get(i);
                }
            }
            return productoMayorStock;
    }
    public void filtrarProductosPorPrecio(double min, double max){
        System.out.println("Rango de Precios $" + min + "y $: " + max);
        boolean encontrado= false;
        for (Producto p : this.productos){
            if(p.getPrecio()>= min && p.getPrecio()<=max){
            p.mostrarInfo();        
            encontrado= true;
    
            }
        }
        if(encontrado){
        } else {
            System.out.println("No hay productos con ese rango de precio");
        }
    }
    
    public void mostrarCategoriasDisponibles(){
        Set<CategoriaProducto> categoriasDisponibles = new HashSet<>();
        for (Producto p:this.productos){
            categoriasDisponibles.add(p.getCategoria());
            
        }
        System.out.println("Categorias Disponibles:" );
        if (categoriasDisponibles. isEmpty()){
            System.out.println("No hay categorias en el inventario");
        }else{
            for(CategoriaProducto categoria :categoriasDisponibles){
                System.out.println("- "+ categoria.name()+ " :"+categoria.getDescripcion());
            }
        }
    }
}
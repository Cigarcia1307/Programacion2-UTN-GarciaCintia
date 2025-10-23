/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadestock;

/**
 *
 * @author HP
 */
public class SistemaDeStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario inventario= new Inventario();
        
        Producto p1= new Producto ("A001", "Notebook hp", 650000.50, 10, CategoriaProducto.ELECTRONICA);
        Producto p2= new Producto ("B004", "Top Zara", 15000.50, 1, CategoriaProducto.ROPA);
        Producto p3= new Producto ("C001", "Toallones ", 50000.00, 8, CategoriaProducto.HOGAR);
        Producto p4= new Producto ("D005", "Leche Larga Vida", 1399.99, 25, CategoriaProducto.ALIMENTOS);
        Producto p5= new Producto ("A017", "Smart 75", 12000000.00, 4, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("Listado de Productos:");
        inventario.listarProductos();
        
        System.out.println("Buscar un Producto: (A001");
        Producto productoEncontrado = inventario.buscarProductoPorId("A001");
        if (productoEncontrado != null) {
            productoEncontrado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
            
        
        }
        System.out.println("Filtrar por categoria: (ELECTRONICA)");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        
        System.out.println("eliminar producto por ID (B004)");
        inventario.eliminarProducto("D004");

        System.out.println("Inventario después de la eliminación ");
        inventario.listarProductos();
        
 

        System.out.println(" Actualizar stock de C001 ");
        inventario.actualizarStock("C001", 70);
        inventario.buscarProductoPorId("C001").mostrarInfo();
        
      

        System.out.println(" Mostrar total de stock ");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("El stock total del inventario es: " + totalStock);
        
        System.out.println(" Obtener producto con mayor stock ");
        Producto productoConMayorStock = inventario.obtenerProductoConMayorStock();
        if (productoConMayorStock != null) {
            System.out.println("El producto con mayor stock es:");
            productoConMayorStock.mostrarInfo();
        }
        System.out.println("Filtrar productos por precio entre $100.00 y $1000.00");
        inventario.filtrarProductosPorPrecio(100.00, 1000.00);
        
        System.out.println("Categoris Disponibles:" );
        inventario.mostrarCategoriasDisponibles();
    }
    
    
      
}

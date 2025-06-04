package Ejercicio3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();

        almacen.agregarProducto(new Alimento("Manzana", 1.2));
        almacen.agregarProducto(new Electronicos("Auriculares", 25.0));
        almacen.agregarProducto(new Producto("Genérico", 10.5));

        List<Producto> lista = almacen.getProductos();

        System.out.println("Productos almacenados:");
        almacen.imprimirProductos(lista);
    }
}

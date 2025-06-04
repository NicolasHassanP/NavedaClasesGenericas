package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Almacen<Alimento> almacen = new Almacen<>();

        almacen.agregarElemento(new Alimento("Pan", 1.5));
        almacen.agregarElemento(new Alimento("Leche", 2.0));

        List<Producto> listaProductos = new ArrayList<>(almacen.getElementos());

        System.out.println("Elementos del almacén:");
        almacen.imprimirElementos(listaProductos);
    }
}

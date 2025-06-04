package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Almacen<T> {
    private List<T> elementos;

    public Almacen() {
        elementos = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    public void imprimirElementos(List<? super T> lista) {
        for (Object e : lista) {
            System.out.println(e);
        }
    }

    public List<T> getElementos() {
        return elementos;
    }
}

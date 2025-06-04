import java.util.NoSuchElementException;

public class PilaArray<E> {
    private E[] elementos;
    private int contador;

    @SuppressWarnings("unchecked")
    public PilaArray(int capacidad) {
        elementos = (E[]) new Object[capacidad];
        contador = 0;
    }

    public boolean estaVacia() {
        return contador == 0;
    }

    public boolean anadir(E elemento) {
        if (contador < elementos.length) {
            elementos[contador] = elemento;
            contador++;
            return true;
        } else {
            return false;
        }
    }

    public E primero() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        return elementos[contador - 1];
    }

    public E extraer() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        contador--;
        return elementos[contador];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pila: [");
        for (int i = 0; i < contador; i++) {
            sb.append(elementos[i]);
            if (i < contador - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
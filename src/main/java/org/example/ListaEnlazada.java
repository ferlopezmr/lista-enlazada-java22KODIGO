package org.example;

public class ListaEnlazada{
    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Inserta un nodo al inicio
    public void insertarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    // Elimina el nodo al inicio
    public void eliminarAlInicio() {
        if (cabeza != null) {
            cabeza = cabeza.siguiente;
        } else {
            System.out.println("La lista está vacía. No se puede eliminar.");
        }
    }

    // Imprimir la lista
    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Buscar un elemento
    public boolean buscar(int dato) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == dato) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo actual = cabeza;
        while (actual != null) {
            sb.append(actual.dato).append(" -> ");
            actual = actual.siguiente;
        }
        sb.append("null");
        return sb.toString();
    }

}
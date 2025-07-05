package org.test;
import org.example.ListaEnlazada;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListaEnlazadaTest {

    private ListaEnlazada lista;

    @BeforeEach
    void setUp() {
        lista = new ListaEnlazada();
    }

    @Test
    void insertarAlInicioTest() {
        lista.insertarAlInicio(10);
        assertTrue(lista.buscar(10), "El valor 10 debe estar en la lista después de insertarlo.");
    }

    @Test
    void eliminarAlInicio() {
        lista.insertarAlInicio(20);
        lista.eliminarAlInicio();
        assertFalse(lista.buscar(20), "El valor 20 no debe estar después de eliminarlo.");
    }

    @Test
    void buscar() {
        assertFalse(lista.buscar(99), "Buscar en lista vacía debe retornar false.");
    }

    @Test
    void insertarMultiples() {
        lista.insertarAlInicio(30);
        lista.insertarAlInicio(40);
        lista.insertarAlInicio(50);
        String resultadoEsperado = "50 -> 40 -> 30 -> null";
        assertEquals(resultadoEsperado, lista.toString(), "El orden de inserción no es el esperado.");
    }
}

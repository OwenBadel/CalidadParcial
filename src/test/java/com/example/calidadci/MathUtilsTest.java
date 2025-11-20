package com.example.calidadci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private final MathUtils utils = new MathUtils();

    @Test
    void testSumar() {
        assertEquals(7, utils.sumar(3, 4));
        assertEquals(-1, utils.sumar(-3, 2));
    }

    @Test
    void testMultiplicar() {
        assertEquals(12, utils.multiplicar(3, 4));
        assertEquals(0, utils.multiplicar(0, 5));
    }

    @Test
    void testConcatenar() {
        assertEquals("GanarParcial", utils.concatenar("Ganar", "Parcial"));
        assertEquals("Ganar", utils.concatenar("Ganar", null));
        assertEquals("Parcial", utils.concatenar(null, "Parcial"));
        assertEquals("", utils.concatenar(null, null));
    }

    @Test
    void testInvertir() {
        assertEquals("laicraP", utils.invertir("Parcial"));
        assertEquals("", utils.invertir(null));
        assertEquals("A", utils.invertir("A"));
    }
}

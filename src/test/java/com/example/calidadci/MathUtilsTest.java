package com.example.calidadci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testSumar() {
        assertEquals(6, MathUtils.sumar(3, 4));
        assertEquals(-1, MathUtils.sumar(-3, 2));
    }

    @Test
    void testMultiplicar() {
        assertEquals(12, MathUtils.multiplicar(3, 4));
        assertEquals(0, MathUtils.multiplicar(0, 5));
    }

    @Test
    void testConcatenar() {
        assertEquals("GanarParcial", MathUtils.concatenar("Ganar", "Parcial"));
        assertEquals("Ganar", MathUtils.concatenar("Ganar", null));
        assertEquals("Parcial", MathUtils.concatenar(null, "Parcial"));
        assertEquals("", MathUtils.concatenar(null, null));
    }

    @Test
    void testInvertir() {
        assertEquals("laicraP", MathUtils.invertir("Parcial"));
        assertEquals("", MathUtils.invertir(null));
        assertEquals("A", MathUtils.invertir("A"));
    }
}

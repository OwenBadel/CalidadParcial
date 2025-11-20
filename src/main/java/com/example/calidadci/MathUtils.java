package com.example.calidadci;

public class MathUtils {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public String concatenar(String a, String b) {
        if (a == null) {
            a = "";
        }
        if (b == null) {
            b = "";
        }
        return a + b;
    }

    public String invertir(String texto) {
        if (texto == null) {
            return "";
        }
        return new StringBuilder(texto).reverse().toString();
    }
}

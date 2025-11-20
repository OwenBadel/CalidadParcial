package com.example.calidadci;

/**
 * Utility class for mathematical and string operations.
 */
public final class MathUtils {

    /**
     * Private constructor to prevent instantiation.
     */
    private MathUtils() {
    }

    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public static int sumar(final int a, final int b) {
        return a + b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    public static int multiplicar(final int a, final int b) {
        return a * b;
    }

    /**
     * Concatenates two strings.
     *
     * @param a the first string
     * @param b the second string
     * @return the concatenation of a and b
     */
    public static String concatenar(final String a, final String b) {
        String first = a == null ? "" : a;
        String second = b == null ? "" : b;
        return first + second;
    }

    /**
     * Reverses a string.
     *
     * @param texto the string to reverse
     * @return the reversed string
     */
    public static String invertir(final String texto) {
        if (texto == null) {
            return "";
        }
        return new StringBuilder(texto).reverse().toString();
    }
}

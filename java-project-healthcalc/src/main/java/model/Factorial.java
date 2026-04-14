package model;

/**
 * Esta interfaz define una sola operación: el factorial de un número.
 */
public interface Factorial {

    /**
     * Calcula el factorial de un número entero.
     *
     * @param n Número de entrada.
     * @return Factorial de n (n!).
     * @throws IllegalArgumentException Si n es negativo.
     */
    long fact(int n);
}
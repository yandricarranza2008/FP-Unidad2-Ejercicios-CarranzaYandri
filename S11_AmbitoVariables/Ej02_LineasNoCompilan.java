/*
 Sesión: S11 - Ámbito de las variables
 Ejercicio 02: Líneas que no compilan
 Enunciado: Indica qué líneas no compilan y por qué.
 Autor: Carranza Yandri
 Fecha: 20/11/2026
 */

public class Ej02_LineasNoCompilan {

    static int contadorGlobal = 1;

    static int calcularCuadrado(int base) {
        int resultado = base * base;
        return resultado;
    }

    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 2; i++) {
            total += calcularCuadrado(i);
        }

        // System.out.println(i);
        // Mensaje del compilador: error: cannot find symbol (variable i)
        // Causa: i es una variable de bloque del for y ya no existe fuera de sus llaves.

        // System.out.println(resultado);
        // Mensaje del compilador: error: cannot find symbol (variable resultado)
        // Causa: resultado es una variable local de calcularCuadrado, no existe en main.

        // int total = 10;
        // Mensaje del compilador: error: variable total is already defined in method main(String[])
        // Causa: total ya fue declarada antes en el mismo ámbito de main.

        System.out.println("Total: " + total);
        System.out.println("Contador global: " + contadorGlobal);
    }
}
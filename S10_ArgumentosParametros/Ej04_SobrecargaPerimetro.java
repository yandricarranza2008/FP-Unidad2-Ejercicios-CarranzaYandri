/*
 Sesión: S10 - Argumentos y parámetros
 Ejercicio 04: Sobrecarga de perímetro
 Enunciado: Sobrecarga perimetro(double lado) (cuadrado) y perimetro(double a, double b) (rectángulo).    
 Autor: Carranza Yandri
 Fecha: 19/11/2026
 */

import java.util.Locale;

public class Ej04_SobrecargaPerimetro {

    static double perimetro(double lado) {
        return 4 * lado;
    }

    static double perimetro(double a, double b) {
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.printf("Perimetro cuadrado:   %.2f%n", perimetro(5));
        System.out.printf("Perimetro rectangulo: %.2f%n", perimetro(6, 3.5));
    }
}
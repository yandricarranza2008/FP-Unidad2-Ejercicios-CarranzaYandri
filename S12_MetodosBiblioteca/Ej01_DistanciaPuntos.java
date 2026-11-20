/*
 Sesión: S12 - Métodos de biblioteca
 Ejercicio 01: Distancia entre dos puntos
 Enunciado: Distancia entre dos puntos con Math.sqrt y Math.pow.
 Autor: Carranza Yandri
 Fecha: 20/11/2026
 */

import java.util.Locale;

public class Ej01_DistanciaPuntos {

    static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double distancia = calcularDistancia(1.0, 2.0, 4.0, 6.0);
        System.out.printf("Distancia entre los puntos: %.2f%n", distancia);
    }
}
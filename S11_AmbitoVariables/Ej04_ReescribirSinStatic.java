/*
 Sesión: S11 - Ámbito de las variables
 Ejercicio 04: Reescribir sin atributos static
 Enunciado: Reescribe un programa que usa 3 atributos static para que use parámetros y return.
 Autor: Carranza Yandri
 Fecha: 20/11/2026
 */

import java.util.Locale;

public class Ej04_ReescribirSinStatic {

    /*
     Versión original de mala práctica con 3 atributos static:
     static double nota1;
     static double nota2;
     static double promedio;
     static void calcular() { promedio = (nota1 + nota2) / 2; }
     */

    // Versión corregida usando parámetros y return (ámbito local):
    static double calcularPromedio(double nota1, double nota2) {
        double promedio = (nota1 + nota2) / 2.0;
        return promedio;
    }

    static boolean estaAprobado(double promedio) {
        return promedio >= 14.0;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double n1 = 15.5;
        double n2 = 13.5;

        double prom = calcularPromedio(n1, n2);
        boolean aprobado = estaAprobado(prom);

        System.out.printf("Promedio: %.2f%n", prom);
        System.out.println("¿Aprobado?: " + aprobado);
    }
}
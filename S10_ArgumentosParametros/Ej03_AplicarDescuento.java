/*
 Sesión: S10 - Argumentos y parámetros
 Ejercicio 03: Aplicar descuento a un arreglo
 Enunciado: aplicarDescuento(double[] precios, double pct) que modifique todo el arreglo. 
 Autor: Carranza Yandri
 Fecha: 19/11/2026
 */

import java.util.Arrays;
import java.util.Locale;

public class Ej03_AplicarDescuento {

    static void aplicarDescuento(double[] precios, double pct) {
        double factor = 1 - (pct / 100.0);
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] * factor;
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double[] precios = {10.0, 25.5, 40.0, 15.0};

        System.out.println("Precios antes:   " + Arrays.toString(precios));
        aplicarDescuento(precios, 10);
        System.out.println("Precios despues: " + Arrays.toString(precios));
    }
}
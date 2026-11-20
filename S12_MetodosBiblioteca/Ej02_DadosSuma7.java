/*
 Sesión: S12 - Métodos de biblioteca
 Ejercicio 02: Dados que suman 7
 Enunciado: Lanzar dos dados 1000 veces y contar cuántas veces suman 7 (Random).
 Autor: Carranza Yandri
 Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej02_DadosSuma7 {

    public static void main(String[] args) {
        Random azar = new Random(42);
        int vecesSuma7 = 0;

        for (int i = 0; i < 1000; i++) {
            int dado1 = azar.nextInt(6) + 1;
            int dado2 = azar.nextInt(6) + 1;

            if (dado1 + dado2 == 7) {
                vecesSuma7++;
            }
        }

        System.out.println("En 1000 lanzamientos, sumaron 7: " + vecesSuma7 + " veces");
    }
}
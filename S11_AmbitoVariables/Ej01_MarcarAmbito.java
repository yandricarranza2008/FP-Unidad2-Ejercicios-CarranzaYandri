/*
 Sesión: S11 - Ámbito de las variables
 Ejercicio 01: Marcar ámbitos
 Enunciado: Marca con colores el ámbito de cada variable de un programa impreso de 25 líneas.
 Autor: Carranza Yandri
 Fecha: 20/11/2026
 */

public class Ej01_MarcarAmbito {

    static int totalOperaciones = 0; 

    static int sumarDoble(int n) { 
        int doble = n * 2; 
        totalOperaciones++;
        return doble;
    }

    public static void main(String[] args) {
        int acumulado = 0; // variable local

        for (int i = 1; i <= 3; i++) { // i es variable de bloque dentro del for
            int parcial = sumarDoble(i); // variable local o de bloque si se toma dentro del for
            acumulado += parcial;
        }

        if (acumulado > 0) {
            int bonus = 2; // variable de bloque dentro del if
            acumulado += bonus;
        }

        System.out.println("Acumulado: " + acumulado);
        System.out.println("Operaciones: " + totalOperaciones);
    }
}
/*
 Sesión: S11 - Ámbito de las variables
 Ejercicio 03: Traza con contador static
 Enunciado: Haz la traza de un programa con un contador static llamado desde un for.
 Autor: Carranza Yandri
 Fecha: 20/11/2026
 */

public class Ej03_TrazaContadorStatic {

    static int contador = 0; // atributo static donde vive toda la ejecución

    static int procesar(int n) {
        contador++; 
        int doble = n * 2;
        return doble;
    }

    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 4; i++) {
            suma += procesar(i);
        }

        System.out.println("Suma final: " + suma);
        System.out.println("Total llamadas (contador): " + contador);
    }
}

/*
 Tabla de Traza de Iteración por iteración)
 -------------------------------------------------------------------------
 Paso / Iteración | Variable i | Argumento n | contador (static) | suma
 -------------------------------------------------------------------------
 Inicio main      | no existe  | -           | 0                 | 0
 i = 1 (1 <= 4)   | 1          | 1           | 1                 | 2
 i = 2 (2 <= 4)   | 2          | 2           | 2                 | 6
 i = 3 (3 <= 4)   | 3          | 3           | 3                 | 12
 i = 4 (4 <= 4)   | 4          | 4           | 4                 | 20
 Fin del for      | desaparece | -           | 4                 | 20
 -------------------------------------------------------------------------
 Salida impresa:
 Suma final: 20
 Total llamadas (contador): 4
 */
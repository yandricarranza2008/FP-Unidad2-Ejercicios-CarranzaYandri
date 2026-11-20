/*
 Sesión: S10 - Argumentos y parámetros
 Ejercicio 02: Intercambiar posiciones de un arreglo
 Enunciado: Escribe intercambiar(int[] v, int i, int j) que intercambie dos posiciones del arreglo. ¿Ahora sí?
 Autor: Carranza Yandri
 Fecha: 19/11/2026
 */

import java.util.Arrays;

public class Ej02_IntercambiarArreglo {

    static void intercambiar(int[] v, int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40};

        System.out.println("Antes: " + Arrays.toString(numeros));
        intercambiar(numeros, 0, 2);
        System.out.println("Despues: " + Arrays.toString(numeros));
    }
}

/*
 ¿Por qué ahora sí funciona?
 Porque aunque Java sigue pasando el valor por valor, en un arreglo lo que se copia
 es la referencia (la dirección del arreglo en memoria). Tanto numeros como v apuntan
 al mismo arreglo, por lo que cambiar v[i] y v[j] modifica directamente los datos originales.
 */
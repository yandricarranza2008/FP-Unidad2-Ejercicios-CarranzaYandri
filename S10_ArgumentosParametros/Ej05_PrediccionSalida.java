/*
 Sesión: S10 - Argumentos y parámetros
 Ejercicio 05: Predicción de salida
 Enunciado: Predice en papel la salida de un programa con 3 llamadas antes de ejecutarlo.
 Autor: Carranza Yandri
 Fecha: 19/11/2026
 */

public class Ej05_PrediccionSalida {

    static int sumarDiez(int x) {
        x = x + 10;
        return x;
    }

    static void agregarExtra(int[] arr) {
        arr[0] = arr[0] + 5;
    }

    public static void main(String[] args) {
        int num = 8;
        int[] valores = {12, 20};

        // 1ra llamada:
        System.out.println("Llamada 1: " + sumarDiez(num));

        // 2da llamada:
        System.out.println("Llamada 2 (num): " + num);

        // 3ra llamada:
        agregarExtra(valores);
        System.out.println("Llamada 3 (valores[0]): " + valores[0]);
    }
}

/*
 Salida predicha antes de ejecutar:
 Llamada 1: 18
 Llamada 2 (num): 8
 Llamada 3 (valores[0]): 17

 Salida real al ejecutar:
 Llamada 1: 18
 Llamada 2 (num): 8
 Llamada 3 (valores[0]): 17
 */    


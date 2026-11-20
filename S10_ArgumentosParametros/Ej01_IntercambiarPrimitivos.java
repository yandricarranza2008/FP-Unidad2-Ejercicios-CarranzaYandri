/*
 Sesión: S10 - Argumentos y parámetros
 Ejercicio 01: Intercambiar primitivos
 Enunciado: Escribe intercambiar(int a, int b) e intenta intercambiar dos variables de main. ¿Funciona? Explica.
 Autor: Carranza Yandri
 Fecha: 18/11/2026
 */

public class Ej01_IntercambiarPrimitivos {

    static void intercambiar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Dentro del metodo -> a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("Antes de llamar -> x = " + x + ", y = " + y);
        intercambiar(x, y);
        System.out.println("Despues de llamar -> x = " + x + ", y = " + y);
    }
}

/*
 ¿Funciona? No, en main las variables x y y siguen valiendo 10 y 20.
 ¿Por qué? Porque en Java el paso de parámetros para tipos primitivos es por valor:
 el método recibe copias de x y y, intercambia solo esas copias y al terminar
 el método desaparecen sin afectar a las variables originales de main.
 */
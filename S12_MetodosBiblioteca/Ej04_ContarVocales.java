/*
 Sesión: S12 - Métodos de biblioteca
 Ejercicio 04: Contar vocales
 Enunciado: Contar vocales de una frase (String + Character).
 Autor: Carranza Yandri
 Fecha: 20/11/2026
 */

public class Ej04_ContarVocales {

    static int contarVocales(String frase) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        String texto = "Programacion en Java desde ESPE";
        int totalVocales = contarVocales(texto);

        System.out.println("Frase: " + texto);
        System.out.println("Cantidad de vocales: " + totalVocales);
    }
}
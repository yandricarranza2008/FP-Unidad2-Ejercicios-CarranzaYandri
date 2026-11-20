/*
 Sesión: S12 - Métodos de biblioteca
 Ejercicio 05: Generar código
 Enunciado: Generar un código de 6 caracteres: 3 letras aleatorias + 3 dígitos.
 Autor: Carranza Yandri
 Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej05_GenerarCodigo {

    static String generarCodigo(Random azar) {
        String codigo = "";

        for (int i = 0; i < 3; i++) {
            char letra = (char) ('A' + azar.nextInt(26));
            codigo = codigo + letra;
        }

        for (int i = 0; i < 3; i++) {
            int digito = azar.nextInt(10);
            codigo = codigo + digito;
        }

        return codigo;
    }

    public static void main(String[] args) {
        Random azar = new Random(42);
        String codigoGenerado = generarCodigo(azar);
        System.out.println("Codigo generado: " + codigoGenerado);
    }
}
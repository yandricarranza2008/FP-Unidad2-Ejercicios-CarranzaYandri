/*
 Sesión: S12 - Métodos de biblioteca
 Ejercicio 03: Validar contraseña
 Enunciado: Validar una contraseña: mínimo 8 caracteres, al menos una mayúscula y un dígito (Character).
 Autor: Carranza Yandri
 Fecha: 20/11/2026
 */

public class Ej03_ValidarContrasena {

    static boolean esContrasenaValida(String clave) {
        if (clave.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
            if (Character.isDigit(c)) {
                tieneDigito = true;
            }
        }

        return tieneMayuscula && tieneDigito;
    }

    public static void main(String[] args) {
        String p1 = "Clave123";
        String p2 = "clave123";
        String p3 = "Ab1";

        System.out.println(p1 + " -> valida: " + esContrasenaValida(p1));
        System.out.println(p2 + " -> valida: " + esContrasenaValida(p2));
        System.out.println(p3 + " -> valida: " + esContrasenaValida(p3));
    }
}
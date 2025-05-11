package Resol_CenturionF;

import java.util.Scanner;

public class Ejercicio4 {
    public static void contarVocales() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine().toLowerCase();

        int contador = 0;
        for (char c : palabra.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }

        System.out.println("La palabra contiene " + contador + " vocal(es).");
        sc.close();
    }
}

package Resol_CenturionF;


import java.util.Scanner;

public class Ejercicio9 {
    public static void contarPalabras() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una oración: ");
        String oracion = sc.nextLine().trim();

        if (oracion.isEmpty()) {
            System.out.println("No se ingresó texto.");
        } else {
            String[] palabras = oracion.split("\\s+");
            System.out.println("La oración contiene " + palabras.length + " palabra(s).");
        }

        sc.close();
    }
}

package Resol_CenturionF;
import java.util.Scanner;

public class Ejercicio5 {
    public static void verificarPalindromo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine().toLowerCase().replaceAll("\s+", "");

        String invertida = new StringBuilder(palabra).reverse().toString();

        if (palabra.equals(invertida)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }

        sc.close();
    }
}

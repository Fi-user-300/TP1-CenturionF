package Resol_CenturionF;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
    public static void ordenarNumeros() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 números enteros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);
        System.out.println("Números ordenados de mayor a menor:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}

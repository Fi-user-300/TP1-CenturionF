package Resol_CenturionF;

import java.util.Scanner;

public class Ejercicio11 {
    public static int fibonacci(int n) {
        if (n <= 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void mostrarFibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el término n de la serie Fibonacci: ");
        int n = sc.nextInt();

        System.out.println("Serie Fibonacci hasta el término " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        sc.close();
    }
}

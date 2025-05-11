package Resol_CenturionF;

import java.util.Scanner;

public class Ejercicio3 {
    public static void mostrarTabla() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número para ver su tabla de multiplicar: ");
        int numero = sc.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        sc.close();
    }
}

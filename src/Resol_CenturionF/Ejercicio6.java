package Resol_CenturionF;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
    public static void adivinarNumero() {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int intento;
        int intentos = 0;

        System.out.println("¡Adivina el número entre 1 y 100!");

        do {
            System.out.print("Tu intento: ");
            intento = sc.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("Más alto.");
            } else if (intento > numeroSecreto) {
                System.out.println("Más bajo.");
            } else {
                System.out.println("¡Correcto! Adivinaste en " + intentos + " intento(s).");
            }
        } while (intento != numeroSecreto);

        sc.close();
    }
}

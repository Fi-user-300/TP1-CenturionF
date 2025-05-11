package Resol_CenturionF;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void generarNumerosAleatorios() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("¿Cuántos números aleatorios desea generar? ");
        int cantidad = sc.nextInt();

        System.out.print("Ingrese el valor mínimo: ");
        int minimo = sc.nextInt();

        System.out.print("Ingrese el valor máximo: ");
        int maximo = sc.nextInt();

        if (minimo > maximo) {
            System.out.println("El mínimo no puede ser mayor que el máximo.");
        } else {
            System.out.println("Números aleatorios generados:");
            for (int i = 0; i < cantidad; i++) {
                int aleatorio = random.nextInt(maximo - minimo + 1) + minimo;
                System.out.println(aleatorio);
            }
        }

        sc.close();
    }
}

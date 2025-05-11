package Resol_CenturionF;
public class Ejercicio14 {
    public static void quitarCeros() {
        int[][] datos = {
                {1, 2, 0, 3, 0, 7},
                {0, 0, 0, 0},
                {0, 6, 9, 8, 0, 9, 6},
                {0, 0, 0, 0, 7, 9, 0, 0},
                {0, 0, 0, 0, 0},
                {8, 7, 0, 8, 9, 0, 8}
        };

        System.out.println("Arreglo original:");
        mostrar(datos);

        System.out.println("Arreglo sin ceros y líneas vacías:");
        for (int[] fila : datos) {
            int cuentaCeros = 0;
            for (int num : fila) {
                if (num == 0) cuentaCeros++;
            }

            if (cuentaCeros == fila.length) continue;

            for (int num : fila) {
                if (num != 0) System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void mostrar(int[][] arreglo) {
        for (int[] fila : arreglo) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

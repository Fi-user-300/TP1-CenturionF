package Resol_CenturionF;
public class Ejercicio13 {
    public static void notasEstudiantes() {
        String[] estudiantes = {"Ana", "Luis", "Sofía"};
        double[][] notas = {
                {8.5, 7.0, 9.0},
                {6.0, 6.5, 7.0},
                {9.5, 9.0, 10.0}
        };

        for (int i = 0; i < estudiantes.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            System.out.println(estudiantes[i] + " - Promedio: " + promedio);
        }
    }
}

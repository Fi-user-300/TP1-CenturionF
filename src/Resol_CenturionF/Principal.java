package Resol_CenturionF;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el número de ejercicio (1-14):");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> Ejercicio1.saludar(args);
            case 2 -> Ejercicio2.verificarPar(args);
            case 3 -> Ejercicio3.mostrarTabla();
            case 4 -> Ejercicio4.contarVocales();
            case 5 -> Ejercicio5.verificarPalindromo();
            case 6 -> Ejercicio6.adivinarNumero();
            case 7 -> Ejercicio7.menuInteractivo();
            case 8 -> Ejercicio8.conversorTemperatura();
            case 9 -> Ejercicio9.contarPalabras();
            case 10 -> Ejercicio10.generarNumerosAleatorios();
            case 11 -> Ejercicio11.mostrarFibonacci();
            case 12 -> Ejercicio12.ordenarNumeros();
            case 13 -> Ejercicio13.notasEstudiantes();
            case 14 -> Ejercicio14.quitarCeros();
            default -> System.out.println("Ejercicio no válido.");
        }

        sc.close();
    }
}

package Resol_CenturionF;

public class Ejercicio2 {
    public static void verificarPar(String[] args) {
        if (args.length > 0) {
            try {
                int numero = Integer.parseInt(args[0]);
                if (numero % 2 == 0) {
                    System.out.println(numero + " es un número par.");
                } else {
                    System.out.println(numero + " no es un número par.");
                }
            } catch (NumberFormatException e) {
                System.out.println("El argumento ingresado no es un número válido.");
            }
        } else {
            System.out.println("Debe ingresar un número como argumento.");
        }
    }
}

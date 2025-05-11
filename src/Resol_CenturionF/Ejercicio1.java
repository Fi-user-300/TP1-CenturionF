package Resol_CenturionF;

public class Ejercicio1 {
    public static void saludar(String[] args) {
        if (args.length > 0) {
            System.out.println("¡Hola " + args[0] + "!");
        } else {
            System.out.println("Debe ingresar su nombre como argumento.");
        }
    }
}

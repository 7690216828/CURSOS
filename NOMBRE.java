import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class NOMBRE {

    public static void main(String[] args) {
        String nombre;

        Scanner Entrada = new Scanner(System.in);
        System.out.println("BIENVENIDO AL SISTEMA SALUDO");
        System.out.println("INGRESA TU NOMBRE HUMANO");
        nombre = Entrada.nextLine();
        System.out.println("Bienvenido a Progra 2 2022 "+ nombre);
    }
}

package javaapplication68;

import java.util.Scanner;

/**
 *
 * @author joelsanchez
 */
public class JavaApplication68 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion;

        do {
            System.out.println("\nOpciones:");
            System.out.println("2. Listar tareas");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 2:
                    // Aquí se recorre e imprime el array
                    gestor.mostrarTareas();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}
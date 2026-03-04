package javaapplication68;

import java.util.Scanner;


public class JavaApplication68 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion;
        
        do{
            System.out.println("Menu");
            System.out.println("1. Añadir Tarea");
            System.out.println("2. Listar tareas");
            System.out.println("0. Salir");
            
            opcion = teclado.nextInt();
            teclado.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("Introduce la Tarea: ");
                    String descripcion = teclado.nextLine();
                    gestor.añadirTarea(descripcion);
                    break;
                    
                case 2:
                    // Aquí se recorre e imprime el array
                    gestor.mostrarTareas();
                    break;
                    
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            
        } while (opcion !=0);
        
        teclado.close();
    }
}
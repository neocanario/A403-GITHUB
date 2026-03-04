package javaapplication68;

import java.util.ArrayList;

public class GestorTareas {
    
    ArrayList<Tarea> tareas;
    
    public GestorTareas(){
        this.tareas = new ArrayList <> ();
    }
    
    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i).descripcion);
            }
        }
    }
}
package javaapplication68;

import java.util.ArrayList;

public class GestorTareas {
    
    ArrayList<Tarea> lista;
    
    public GestorTareas(){
        this.lista = new ArrayList <> ();
    }
    
    public void mostrarTareas() {
        if (lista.isEmpty()) {
            System.out.println("No hay tareas registradas.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println((i + 1) + ". " + lista.get(i).descripcion);
            }
        }
    }
}
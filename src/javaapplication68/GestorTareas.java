package javaapplication68;

import java.util.ArrayList;

public class GestorTareas {
    
    public ArrayList<Tarea> tareas;
    
    
    public GestorTareas(){
        this.tareas = new ArrayList <> ();
    }
    
    public void añadirTarea(String descripcion){
        Tarea nueva = new Tarea(descripcion, false);
        tareas.add(nueva);
    }
    
}

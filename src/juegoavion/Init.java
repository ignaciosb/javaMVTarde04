package juegoavion;

import java.util.ArrayList;

class PilotoAvion {    
    public PilotoAvion(String nombre, int cantidadDeChoques, boolean leGustaVolar) {
        this.nombre = nombre;
        this.cantidadDeChoques = cantidadDeChoques;
        this.leGustaVolar = leGustaVolar;
    }
    public final String nombre;
    public final int cantidadDeChoques;
    public final boolean leGustaVolar;
}

public class Init {
    public static ArrayList<PilotoAvion> obtenerAquellosQueLesGustaVolarYTienenAccidentes() {
        return null;
    }
    public static ArrayList<PilotoAvion> obtenerAquellosQueLesGustaVolarYNOTienenAccidentes() {
        return null;
    }
    public static ArrayList<PilotoAvion> obtenerAquellosQueNOLesGustaVolarYTienenAccidentes() {
        return null;
    }
    public static ArrayList<PilotoAvion> obtenerAquellosQueNOLesGustaVolarYNOTienenAccidentes() {
        return null;
    }
    public static void mostrarLista(ArrayList<PilotoAvion> pilotos) {
        
    }
    public static ArrayList<PilotoAvion> crearLosPilotos() {
        ArrayList<PilotoAvion> pilotos = new ArrayList<PilotoAvion>();
        
        pilotos.add(new PilotoAvion("Jose", 2, true));
        pilotos.add(new PilotoAvion("Marcos", 1, true));
        pilotos.add(new PilotoAvion("Jesus", 0, false));
        pilotos.add(new PilotoAvion("Abel", 2, true));
        pilotos.add(new PilotoAvion("Juan", 1, false));
        pilotos.add(new PilotoAvion("Pedro", 0, true));
        pilotos.add(new PilotoAvion("Martin", 6, false));
        pilotos.add(new PilotoAvion("Mario", 3, true));
        
        return pilotos;
    }
    public static void main(String[] args) {
        
    }
}

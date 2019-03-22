/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piloto;

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

/**
 *
 * @author EducaciónIT
 */
public class Piloto {
    /**
     * @param args the command line arguments
     */
    
    public static ArrayList<PilotoAvion> obtenerAquellosQueLesGustaVolarYTienenAccidentes(ArrayList<PilotoAvion> listaCompleta) {
        ArrayList<PilotoAvion> pList = new ArrayList<PilotoAvion>();
        for(PilotoAvion p:listaCompleta) {
            if(p.leGustaVolar && p.cantidadDeChoques > 0) {
                pList.add(p);
            }
        }
        return pList;
    }
    public static ArrayList<PilotoAvion> obtenerAquellosQueLesGustaVolarYNOTienenAccidentes(ArrayList<PilotoAvion> listaCompleta) {
        ArrayList<PilotoAvion> pList = new ArrayList<PilotoAvion>();
        for(PilotoAvion p:listaCompleta) {
            if(p.leGustaVolar && p.cantidadDeChoques == 0) {
                pList.add(p);
            }
        }
        return pList;
    }
    public static ArrayList<PilotoAvion> obtenerAquellosQueNOLesGustaVolarYTienenAccidentes(ArrayList<PilotoAvion> listaCompleta) {
        ArrayList<PilotoAvion> pList = new ArrayList<PilotoAvion>();
        for(PilotoAvion p:listaCompleta) {
            if((!p.leGustaVolar) && (p.cantidadDeChoques > 0)) {
                pList.add(p);
            }
        }
        return pList;
    }
    public static ArrayList<PilotoAvion> obtenerAquellosQueNOLesGustaVolarYNOTienenAccidentes(ArrayList<PilotoAvion> listaCompleta) {
        ArrayList<PilotoAvion> pList = new ArrayList<PilotoAvion>();
        for(PilotoAvion p:listaCompleta) {
            if((!p.leGustaVolar) && (p.cantidadDeChoques == 0)) {
                pList.add(p);
            }
        }
        return pList;
    }
    public static void mostrarLista(ArrayList<PilotoAvion> pilotos) {
        for(PilotoAvion p:pilotos) {
            System.out.println(p.nombre);
        }
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
        // TODO code application logic here
        
        ArrayList<PilotoAvion> pilotos = new ArrayList<PilotoAvion>();
        pilotos = crearLosPilotos();
        System.out.println("NO les Gusta Volar y NO Tienen accidentes: ");
        mostrarLista(obtenerAquellosQueNOLesGustaVolarYNOTienenAccidentes(pilotos));
        
        System.out.println("NO les Gusta Volar y Tienen accidentes: ");
        mostrarLista(obtenerAquellosQueNOLesGustaVolarYTienenAccidentes(pilotos));
        
        System.out.println("Les Gusta Volar y NO Tienen accidentes: ");
        mostrarLista(obtenerAquellosQueLesGustaVolarYNOTienenAccidentes(pilotos));
        
        System.out.println("Les Gusta Volar y Tienen accidentes: ");
        mostrarLista(obtenerAquellosQueLesGustaVolarYTienenAccidentes(pilotos));
        
    }
    
}

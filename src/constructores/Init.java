package constructores;

class Watts {
    public final int cantidad;
    public Watts(int cantidad) {
        this.cantidad = cantidad;
    }
}

class ArtefactoIluminacion {
    public ArtefactoIluminacion(int luminancia, Watts cantidadWatts) {
        this.luminancia = luminancia;
        this.cantidadWatts = cantidadWatts;
    }
    private int luminancia;
    private Watts cantidadWatts;
}

public class Init {
    public static void main(String[] args) {
        
    }
}

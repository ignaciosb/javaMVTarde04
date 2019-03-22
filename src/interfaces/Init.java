package interfaces;

import java.util.Date;

interface perecedero {
    java.util.Date obtenerFechaVencimiento();
}

class Macri implements perecedero {
    public Date obtenerFechaVencimiento() {
        return new Date(2023, 12, 11);
    }
}

public class Init {
    public static void main(String[] args) {
        
    }
}

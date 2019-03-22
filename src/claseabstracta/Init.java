package claseabstracta;

abstract class Motor {
    public void habilitarEncendido() {
        System.out.println("Habilitando encendido");
    }
    abstract public void encender();
}

class Naftero extends Motor {
    public void encender() {
        habilitarEncendido();
        System.out.println("Verificando inyectores");
    }
}

class Diesel extends Motor {
    public void encender() {
        System.out.println("Calentar");
        habilitarEncendido();
        System.out.println("Verificando inyectores");
    }
}

public class Init {
    public static void arrancar(Motor m) {
        System.out.println("Subir pasajeros");
        m.encender();
        System.out.println("Avisar que estamos por llegar a la Boca");
    }
    public static void main(String[] args) {
        arrancar(new Diesel());
    }
}

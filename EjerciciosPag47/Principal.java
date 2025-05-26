package EjerciciosPag47;

public class Principal {
    public static void main(String[] args) {
        Vehiculo auto = new Automovil();
        Vehiculo barco = new Barco();
        Vehiculo avion = new Avion();

        auto.mover();
        barco.mover();
        avion.mover();
    }
}

package EjerciciosPag47ejerci3;

public class Main {
    public static void main(String[] args) {
        Ingeniero ing = new Ingeniero("Carmen", 100, 15);
        Profesor prof = new Profesor("Gael", 19, 50);

        ing.calcularSueldo();
        prof.calcularSueldo();
    }
}

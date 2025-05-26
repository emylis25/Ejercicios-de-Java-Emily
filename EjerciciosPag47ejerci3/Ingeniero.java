package EjerciciosPag47ejerci3;

class Ingeniero implements IProfesion {
    private String nombre;
    private int horas;
    private double pago;

    public Ingeniero(String nombre, int horas, double pago) {
        this.nombre = nombre;
        this.horas = horas;
        this.pago = pago;
    }

    public void calcularSueldo() {
        System.out.println("Ingeniero: " + nombre);
        System.out.println("Sueldo: $" + (horas * pago));
    }
}

package EjerciciosPag47ejerci3;

class Profesor implements IProfesion {
    private String nombre;
    private int clases;
    private double pagoPorClase;

    public Profesor(String nombre, int clases, double pago) {
        this.nombre = nombre;
        this.clases = clases;
        this.pagoPorClase = pago;
    }

    public void calcularSueldo() {
        System.out.println("Profesor: " + nombre);
        System.out.println("Sueldo: $" + (clases * pagoPorClase));
    }

}

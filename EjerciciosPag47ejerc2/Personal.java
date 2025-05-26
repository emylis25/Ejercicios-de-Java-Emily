package EjerciciosPag47ejerc2;

abstract class Personal {
    protected String nombre;
    protected int horasTrabajadas;
    protected double pagoPorHora;

    public abstract void registrar(String nombre, int horas, double pago);
    public abstract void calcularSueldo();
}

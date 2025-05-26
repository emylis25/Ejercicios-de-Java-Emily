package EjerciciosPag47ejerc2;

    class Empleado extends Personal {
    @Override
    public void registrar(String nombre, int horas, double pago) {
        this.nombre = nombre;
        this.horasTrabajadas = horas;
        this.pagoPorHora = pago;
    }

    @Override
    public void calcularSueldo() {
        double sueldo = horasTrabajadas * pagoPorHora;
        System.out.println("Empleado: " + nombre);
        System.out.println("Sueldo: $" + sueldo);
    }
}


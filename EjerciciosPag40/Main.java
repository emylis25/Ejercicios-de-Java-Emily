package EjerciciosPag40;

public class Main {
    public static void main(String[] args) {
        // Crear un animal
        Animal miAnimal = new Animal();

        // Usar los métodos para asignar valores
        miAnimal.setNombre("Leon");
        miAnimal.setOrden("Carnívoro");
        miAnimal.setExtremidades(4);

        // Mostrar los datos
        System.out.println("Nombre: " + miAnimal.getNombre());
        System.out.println("Orden: " + miAnimal.getOrden());
        System.out.println("Extremidades: " + miAnimal.getExtremidades());
    }
}

// Clase Animal (en el mismo archivo)
class Animal {
    private String nombre;
    private String orden;
    private int extremidades;

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }
}

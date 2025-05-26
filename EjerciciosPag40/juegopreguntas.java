package EjerciciosPag40;
import java.util.Scanner;

public class juegopreguntas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntaje = 0;

        // Nivel 1 (2 preguntas)
        System.out.println("Nivel 1:");
        puntaje += preguntar(scanner, "¿cual es el animal com 5 vocales?", "murcielago");
        puntaje += preguntar(scanner, "¿Cuál es la capital de Chile?", "Santiago");

        // Nivel 2 (4 preguntas con más puntaje)
        System.out.println("\nNivel 2:");
        puntaje += preguntarNivel2(scanner, "¿Cuál es el resultado de 2 * 3?", "6");
        puntaje += preguntarNivel2(scanner, "¿Cuántas patas tiene una araña?", "8");
        puntaje += preguntarNivel2(scanner, "¿Como se llama nuesro planeta?", "Tierra");
        puntaje += preguntarNivel2(scanner, "¿Cuánto es 10 dividido entre 2?", "5");

        System.out.println("\nPuntaje final acumulado: " + puntaje);
        scanner.close();
    }

    // Preguntas de nivel 1 (valor: 10)
    public static int preguntar(Scanner scanner, String pregunta, String respuestaCorrecta) {
        System.out.println(pregunta);
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase(respuestaCorrecta)) {
            System.out.println("¡Correcto! +10 puntos");
            return 10;
        } else {
            System.out.println("Incorrecto. -5 puntos");
            return -5;
        }
    }

    // Preguntas de nivel 2 (valor: 20 o -10)
    public static int preguntarNivel2(Scanner scanner, String pregunta, String respuestaCorrecta) {
        System.out.println(pregunta);
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase(respuestaCorrecta)) {
            System.out.println("¡Correcto! +20 puntos");
            return 20;
        } else {
            System.out.println("Incorrecto. -10 puntos");
            return -10;
        }
    }
}
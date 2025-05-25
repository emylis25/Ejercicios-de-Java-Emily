import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Ejercicio 1 Pag 32.
        /*
         * Scanner scanner = new Scanner(System.in);
         * String[] frutas = new String[10];
         * 
         * // Permite al usuario ingresar 10 nombres de frutas
         * for (int i = 0; i < frutas.length; i++) {
         * System.out.print("Ingresa el nombre de una fruta : ");
         * frutas[i] = scanner.nextLine();
         * }
         * 
         * // permite ver el orden inverso de los datos ingresados.
         * System.out.println("\nListado de Frutas en orden Inverso:");
         * for (int i = frutas.length - 1; i >= 0; i--) {
         * System.out.println(frutas[i]);
         * }
         */

        // Ejercicio 2 Pag 32.
        /*
         * Scanner scanner = new Scanner(System.in);
         * int[] numeros = new int[12];
         * int suma = 0;
         * // Permite al usuario ingresar 12 números enteros
         * for (int i = 0; i < numeros.length; i++) {
         * System.out.print("Ingresa el número : ");
         * numeros[i] = scanner.nextInt();
         * suma += numeros[i];
         * }
         * // Calcula el promedio de los números ingresados
         * double promedio = (double) suma / numeros.length;
         * System.out.println("El promedio es: " + promedio);
         */

        // Ejercicio 3 Pag 32.
        /*
         * Scanner scanner = new Scanner(System.in);
         * int[] numeros = new int[12];
         * int pares = 0, impares = 0;
         * 
         * // Permite al usuario ingresar 12 números enteros
         * for (int i = 0; i < numeros.length; i++) {
         * System.out.print("Ingresa el número : ");
         * numeros[i] = scanner.nextInt();
         * if (numeros[i] % 2 == 0) {
         * pares++;
         * } else {
         * impares++;
         * }
         * }
         * // Muestra la cantidad de números pares e impares ingresados.
         * System.out.println("Cantidad de números pares ingresados es : " + pares);
         * System.out.println("Cantidad de números impares ingresados es : " + impares);
         */

        // Ejercicio 4 Pag 32.
        /*
         * Scanner scanner = new Scanner(System.in);
         * int[] numeros = new int[10];
         * 
         * // Permite al usuario ingresar 10 números enteros
         * for (int i = 0; i < numeros.length; i++) {
         * System.out.print("Ingresa el número " + (i + 1) + ": ");
         * numeros[i] = scanner.nextInt();
         * }
         * // Muestra el mayor y menor número ingresado
         * int mayor = numeros[0];
         * int menor = numeros[0];
         * 
         * // Recorre el arreglo para encontrar el mayor y menor número
         * for (int i = 1; i < numeros.length; i++) {
         * if (numeros[i] > mayor) {
         * mayor = numeros[i];
         * }
         * if (numeros[i] < menor) {
         * menor = numeros[i];
         * }
         * }
         * // Muestra el mayor y menor número ingresado
         * System.out.println("Mayor: " + mayor);
         * System.out.println("Menor: " + menor);
         */

        // Ejercicio 5 Pag 32.
        /*
         * Scanner scanner = new Scanner(System.in);
         * String[][] articulos = new String[3][3];
         * 
         * // Ingresar artículos
         * for (int i = 0; i < articulos.length; i++) {
         * for (int j = 0; j < articulos[i].length; j++) {
         * System.out.print("Ingresa el nombre de un artículo : ");
         * articulos[i][j] = scanner.nextLine();
         * }
         * }
         * // Mostrar filas en orden invertido
         * System.out.println("\nArtículos (filas invertidas):");
         * for (int i = articulos.length - 1; i >= 0; i--) {
         * for (int j = 0; j < articulos[i].length; j++) {
         * System.out.print(articulos[i][j] + " ");
         * }
         * System.out.println();
         * }
         */

        // Ejercicio 6 Pag 32.
       /* Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // Ingresar datos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingresa el valor : ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar transpuesta
        System.out.println("\nMatriz transpuesta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }*/

        // Ejercicio 7 Pag 32.
        /*Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        // Ingresar datos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingresa el valor : ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean encontrado = false;

        // Buscar punto de silla
        for (int i = 0; i < 3; i++) {
            int minFila = matriz[i][0];
            int col = 0;
            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] < minFila) {
                    minFila = matriz[i][j];
                    col = j;
                }
            }

            boolean esMayorEnCol = true;
            for (int k = 0; k < 3; k++) {
                if (matriz[k][col] > minFila) {
                    esMayorEnCol = false;
                    break;
                }
            }

            if (esMayorEnCol) {
                System.out.println("Punto de silla encontrado: " + minFila);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No hay punto de silla.");
        }*/
    }
}
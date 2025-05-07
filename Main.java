import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Llama a los tres ejercicios uno a uno
        ejercicioCondicionales(sc);
        System.out.println(); // Separador
        ejercicioBucle();
        System.out.println(); // Separador
        ejercicioMediaEdades(sc);

        sc.close();
    }

    // 1. CONDICIONALES
    public static void ejercicioCondicionales(Scanner sc) {
        System.out.print("¿Cuál es tu edad? ");
        int edad = sc.nextInt();

        if (edad < 6 || edad > 120) {
            System.out.println("Error: edad fuera de rango válido.");
        } else if (edad <= 11) {
            System.out.println("Estás en primaria.");
        } else if (edad <= 17) {
            System.out.println("Estás en secundaria.");
        } else if (edad <= 25) {
            System.out.println("Estás en la universidad.");
        } else {
            System.out.println("Probablemente ya estás trabajando.");
        }
    }

    // 2. BUCLE
    public static void ejercicioBucle() {
        System.out.println("Contando del 20 al 10 y mostrando su cuadrado:");
        for (int i = 20; i >= 10; i--) {
            System.out.println("Número: " + i + ", Cuadrado: " + (i * i));
        }
    }

    // 3. MEDIA DE EDADES
    public static void ejercicioMediaEdades(Scanner sc) {
        sc.nextLine(); // Limpiar buffer

        System.out.print("Nombre de tu madre: ");
        String nombreMadre = sc.nextLine();
        System.out.print("Edad de tu madre: ");
        double edadMadre = sc.nextDouble();
        sc.nextLine(); // Limpiar buffer

        System.out.print("Nombre de tu padre: ");
        String nombrePadre = sc.nextLine();
        System.out.print("Edad de tu padre: ");
        double edadPadre = sc.nextDouble();

        double media = (edadMadre + edadPadre) / 2;

        System.out.printf("Tu madre se llama %s y tiene %.0f años, tu padre se llama %s y tiene %.0f años, y la media de sus edades es %.1f\n",
                nombreMadre, edadMadre, nombrePadre, edadPadre, media);
    }
}

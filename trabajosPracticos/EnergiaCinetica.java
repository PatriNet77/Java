package trabajospracticos;

/*Escribir un programa en Java que calcule la energía cinética de un objeto en
movimiento, dados su masa y su velocidad.
Utilizar la fórmula: E = (1/2) *m* v^2, donde E es la energía cinética, m es la masa
del objeto y v es la velocidad.
Muestre el resultado por pantalla. */

import java.util.Scanner;

public class EnergiaCinetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la masa del objeto (en kg): ");
        double m = scanner.nextDouble();

        System.out.println("Ingrese la velocidad del objeto (en m/s): ");
        double v = scanner.nextDouble();

        double e = 0.5 * m * Math.pow(v, 2);

        scanner.close();

        System.out.println("La energía cinética del objeto es: " + e + " joules");

    }
}

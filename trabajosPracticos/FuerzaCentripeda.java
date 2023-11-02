package trabajospracticos;

/*Escribir un programa en Java que calcule la fuerza centrípeta necesaria para
mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular
y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la
fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio
de la trayectoria.
Muestre el resultado por pantalla */

import java.util.Scanner;

public class FuerzaCentripeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la masa del objeto (en kg): ");
        double masa = scanner.nextDouble();

        System.out.println("Ingrese la velocidad angular del objeto (en m/s): ");
        double velocidad = scanner.nextDouble();

        System.out.println("Ingrese el radio de la trayectoria (en m): ");
        double radio = scanner.nextDouble();

        double fuerzaCentripeta = calcularFuerzaCentripeta(masa, velocidad, radio);

        scanner.close();

        System.out.println("La fuerza centrípeta necesaria es: " + fuerzaCentripeta + " N");
    }

    public static double calcularFuerzaCentripeta(double masa, double velocidad, double radio) {
        return masa * Math.pow(velocidad, 2) / radio;
    }
}

package trabajospracticos;

/*Cálculo de la hipotenusa de un triángulo:
Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la
hipotenusa, a y b son los catetos. */

import java.util.Scanner;

public class HipotenusaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del primer cateto:");
        double a = scanner.nextDouble();

        System.out.println("Ingrese el valor del segundo cateto:");
        double b = scanner.nextDouble();

        double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        scanner.close();

        System.out.println("La hipotenusa del triángulo rectángulo es: " + h);

    }
}

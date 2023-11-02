package trabajospracticos;

/*Escribir un programa en Java que calcule la velocidad final de un objeto en caída
libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo
transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i
es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo
transcurrido.
Muestre el resultado por pantalla. */

import java.util.Scanner;

public class VelocidadFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la velocidad inicial del objeto (en m/s): ");
        double vI = scanner.nextDouble();

        System.out.println("Ingrese la aceleración de la gravedad (en m/s^2): ");
        double g = scanner.nextDouble();

        System.out.println("Ingrese el tiempo transcurrido (en s): ");
        double t = scanner.nextDouble();

        double vF = vI + g * t;

        scanner.close();

        System.out.println("La velocidad final del objeto es: " + vF + " m/s");
    }
}

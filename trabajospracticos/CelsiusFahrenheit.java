package trabajospracticos;

/*Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en
Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar
la fórmula con la que se resuelve. */

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        float celsius = 45;
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + "° C equivalen a " + fahrenheit + "° F");

    }
}

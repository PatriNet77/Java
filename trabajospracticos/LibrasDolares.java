package trabajospracticos;

import java.util.Scanner;

/*Conversión de libras esterlinas a dólares: Escribir un programa en Java que
solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en
dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1
libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa
deberá mostrar 70 dólares. */

public class LibrasDolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio_libra = 1.40;
    
        System.out.println("Ingrese la cantidad de libras esterlinas: ");
    
        double libras = scanner.nextDouble();
        double dolares = libras * precio_libra;
    
        System.out.println(libras + " libras esterlinas es igual a " + dolares + " dolares");

        scanner.close();
    
    }
    
}

package trabajospracticos;

/*Conversión de dólares a pesos: Escribir un programa en Java que solicite al
usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos. */

import java.util.Scanner;

public class DolarPeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio_dolar = 20;
    
        System.out.println("Ingrese la cantidad de dolares: ");
    
        double dolares = scanner.nextDouble();
        double pesos = dolares * precio_dolar;
    
        System.out.println(dolares + " dolares es igual a " + pesos + " pesos");

        scanner.close();
    
    }

}

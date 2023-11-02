package trabajospracticos;

import java.util.Scanner;

/*Conversión de pesos a euros: Escribir un programa en Java que solicite al usuario
una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de
cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario
ingresa 5000 pesos, el programa deberá mostrar 250 euros. */

public class PesoEuro {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio_euro = 20;
    
        System.out.println("Ingrese la cantidad de pesos: ");
    
        double pesos = scanner.nextDouble();
        double euro = pesos / precio_euro;
    
        System.out.println(pesos + " pesos es igual a " + euro + " euros");

        scanner.close();
    
    }
    
}

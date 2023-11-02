package trabajospracticos;

import java.util.Scanner;

/*Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000
dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares. */

public class BitcoinsDolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio_bitcoins = 50000;
    
        System.out.println("Ingrese la cantidad de bitcoins: ");
    
        double bitcoins = scanner.nextDouble();
        double dolares = bitcoins * precio_bitcoins;
    
        System.out.println(bitcoins + " bitcoins es igual a " + dolares + " dolares");

        scanner.close();
    
    }
    
}

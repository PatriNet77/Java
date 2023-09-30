package trabajospracticos;

/*Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
de quince multiplicaciones entre dos números enteros divididos por el número de la
multiplicación. Por ejemplo:
Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15
El resultado mostrarlo por pantalla. */

public class Acumulador {
    public static void main(String[] args) {
        var numero1 = 25;
        var numero2 = 5;
        var multiplicacion = numero1 * numero2;
        System.out.println("El resultado de " + numero1 + " por " + numero2 + " es: " + multiplicacion);
        var resultado = multiplicacion / 1 + multiplicacion / 2 + multiplicacion / 3 + multiplicacion / 4 + multiplicacion / 5 + multiplicacion / 6 + multiplicacion / 7 + multiplicacion / 8 + multiplicacion / 9 + multiplicacion / 10 + multiplicacion / 11 + multiplicacion / 12 + multiplicacion / 13 + multiplicacion / 14 + multiplicacion / 15;
        System.out.println("La acumulación de quince multiplicaciones divididas por el número de multiplicación da como resultado: " + resultado);
        
    }
}

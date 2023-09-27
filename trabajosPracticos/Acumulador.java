package trabajospracticos;

/*Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
de quince multiplicaciones entre dos números enteros divididos por el número de la
multiplicación. Por ejemplo:
Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15
El resultado mostrarlo por pantalla. */

public class Acumulador {
    public static void main(String[] args) {
        var numero1 = 6;
        var numero2 = 8;
        var acumulador = "";

        for (int i = 1; i <= 15; i++) {
            acumulador += (numero1 * numero2 / i) + " ";
        }
    }
}

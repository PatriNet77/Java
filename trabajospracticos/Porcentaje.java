package trabajospracticos;

/*Obtener porcentaje : Dados dos números, uno real y el otro entero. Obtenga el
porcentaje que indique el segundo número del primer número. */

public class Porcentaje {
    public static void main(String[] args) {
        double real = 75.0;
        int entero = 25;
        double porcentaje = (entero * real) / 100;

        System.out.println("El " + entero + "% de " + real + " es " + porcentaje);

    }
    
}

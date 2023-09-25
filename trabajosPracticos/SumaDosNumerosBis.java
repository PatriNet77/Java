package trabajosPracticos;

/* Suma de dos números bis: Se les solicita que guarden dos números enteros y los
sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
indique si se trata de un número par o impar.
El mensaje debe tener el siguiente formato:
“El resultado es “ {Resultado} “y es” {paridad} */

public class SumaDosNumerosBis {
    public static void main(String[] args) {
        int num_1 = 21;
        int num_2 = 6;
        int resultado = num_1 + num_2;
        var paridad = resultado % 2 == 0 ? "par":"impar";

        System.out.println("El resultado de la suma de " + num_1 + " y " + num_2 + " es: " + resultado + " y es " + paridad);
    }

}

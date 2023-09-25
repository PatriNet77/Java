package trabajosPracticos;

/*Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
sumen, determine si el primer número es divisible por el segundo número y muestre
el resultado. */

public class CalculoDivisibilidad {
    public static void main(String[] args) {
        int num_1 = 42;
        int num_2 = 8;
        int suma = num_1 + num_2;
        var resultado = num_1 % num_2 == 0 ? " es divisible por ":" no es divisible por ";

        System.out.println("El resultado de la suma de " + num_1 + " y " + num_2 + " es: " + suma + "\n" + num_1 + resultado + num_2);
    }

}

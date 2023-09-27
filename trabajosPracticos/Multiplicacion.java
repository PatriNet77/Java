package trabajospracticos;

/*Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
real? ¿Por qué? */
/*El resultado de la suma un número real y otro entero es otro número real porque predominan los datos de tipo coma flotante. */

public class Multiplicacion {
    
    public static void main(String[] args) {
        double a = 10.25;
        double b = 20.12;
        double c = a * b;

        System.out.println("El resultado de a por b es: " + c);

        int d = 30;
        int e = 6;
        int f = d * e;

        System.out.println("El resultado de d por e es: " + f);

        var suma = c + f;

        System.out.println("El resultado de la suma de c y d es: " + suma);

    }
    
}

package iterativas;

//importo la clase scanner
import java.util.Scanner;

//creo la clase NumerosPrimos
public class NumerosPrimos {
    public static void main(String[] args) {
        
        //declaro variables  e inicializo variable contador
        int numero, contador;
        contador = 0;
        //creo la instancia scanner utilizndo un bloque try-with-resourse que permite que el recurso se cierre luego de su uso
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese un número entre 5 y 25"); //le pido al usuario que ingrese un número entre 5 y 25
            numero = scanner.nextInt(); //se lee el número ingresado por el usuario
            //comprueba si está fuera del rango, muestra un mensaje de error y pide que ingrese otro número hasta que cumpla la condición
            while (numero < 5 || numero > 25){
                System.out.println("Debe ingresar un número entre 5 y 25");
                    numero = scanner.nextInt();
            }
        }

        for (int i = 5; i <= numero; i++){ //se declara la variable i y se la inicializa en 5. El bucle se ejecutará mientras i sea menor o igual al número ingresado por el usuario
            boolean esPrimo = true; //se establece la variable booleana esPrimo en verdadero
            for (int j = 2; j < i; j++){ //se declara la variable j y se la inicializa en 2. El bucle se ejecutará mientras j sea menor a i
                if (i % j == 0){ //en cada iteración se verifica que i sea divisible por j. Si el resultado es igual a 0 indica que i no es número primo ya que es divisible por j                    esPrimo = false; //si se encuentra un divisor para i, se establece la variable booleana en falso
                    esPrimo = false; //se establece la variable booleana esPrimo en falso 
                    break; //sale del bucle
                }
            }
            //si la variable esPrimo es verdadera, el número actual es primo y se incrementa el contador en uno
            if (esPrimo){
                contador++;
            }
        }
        //Se completa el bucle y se muestra el resultado final
        System.out.println("Hay " + contador + " números primos entre el 5 y el " + numero);
    }
}

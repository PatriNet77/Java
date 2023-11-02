package trabajospracticos;

/*Cálculo del área de un círculo: Escribir un programa en Java que calcule el área
de un círculo con un radio de 5 unidades. Buscar la fórmula con la que se
resuelve. */

public class AreaCirculo {
    public static void main(String[] args) {
        double radio = 5;
        double pi = 3.1416;
        double area = pi * (radio * radio);

        System.out.println("El área de un círculo con un radio de 5 unidades es: " + area);
        
    }
    
}

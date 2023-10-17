package trabajospracticos;

/*Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
edad y los nombres de esas personas, luego saque su promedio e imprima por
pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
edades. */

public class PromedioEdad {
    public static void main(String[] args) {
        
        String personas[] = {"Rosa", "Valeria", "Jorge", "Pablo", "Lorena", "Tiago"};
        int edades[] = {22, 56, 78, 45, 34, 13};
        int suma = 0;

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Nombre: " + personas[i] + " " + "Edad: " + edades[i]);

            suma += edades[i];

        }

        int promedio = suma / edades.length;

        System.out.println("El promedio de edad es: " + promedio);

    }

}

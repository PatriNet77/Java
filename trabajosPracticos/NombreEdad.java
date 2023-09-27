package trabajospracticos;

/*Mi nombre y edad: Se le solicita que guarde en un espacio de memoria su nombre
y apellido, luego guarde su edad e imprimalos por pantalla.
El mensaje debe tener el siguiente formato:
“Mi nombre es “ {Nombre}
“Mi edad es” {Edad} */

public class NombreEdad {
    public static void main(String[] args) {
        var nombre = "Patricia";
        var edad = 46;

        System.out.println("Mi nombre es: " + nombre + "\n" + "Mi edad es: " + edad + " años");
    }
}

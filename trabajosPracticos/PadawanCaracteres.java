package trabajospracticos;

/*Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
¿Qué es unicode? 
No se pueden usar "" en una variable tipo char porque las comillas dobles están reservadas para las cadenas de caracteres.
Unicode es un sistema estándar de codificación de caracteres que permite a los dispositivos electrónicos mostrar texto en diferentes idiomas o sistemas de escritura asignando un número único a cada caracter.*/

public class PadawanCaracteres {

    public static void main(String[] args) {

        char P = '\u0050';
        char A = '\u0041';
        char T = '\u0054';
        char R = '\u0052';
        char I = '\u0049';
        char C = '\u0043';
        
        System.out.println("" + P + A + T + R + I + C + I + A);

    }

}

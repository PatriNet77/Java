package trabajosPracticos;

/*Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char? 
Las comillas dobles están reservadas para datos tipo String (cadena de caracteres)*/

public class Caracteres {
    public static void main(String[] args) {
        char p = 'P';
        char a = 'a';
        char t = 't';
        char r = 'r';
        char i = 'i';
        char c = 'c';
        
        System.out.println("" + p + a + t + r + i + c + i + a);
    }
}

package trabajospracticos;

/*Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
una constante de los valores que no van a cambiar en esta conversión. Muestre el
resultado por pantalla */

public class ConversionAKg {
    public static void main(String[] args) {
        double libras = 123;
        double lbakg = libras / 2.20462;
       
        System.out.println(libras + "lb equivalen a " + lbakg + " kg");

    }
}

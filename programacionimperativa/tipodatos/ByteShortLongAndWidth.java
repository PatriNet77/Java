package programacionimperativa.tipodatos;

public class ByteShortLongAndWidth {
    
    public static void main(String[] args) {

        // Byte value - 8 bits - clase wrapper
        System.out.println("Rango del valor de Byte: " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

        byte minValue = -128;
        byte maxValue = 127;

        // Short value - 16 bits - clase wrapper
        System.out.println("Rango del valor de Short: " + Short.MIN_VALUE + " " + Short.MAX_VALUE);

        short minShortValue = -32768;
        short maxShortValue = 32767;

        // Long value - 32 bits - clase wrapper
        System.out.println("Rango del valor de Long: " + Long.MIN_VALUE + " " + Long.MAX_VALUE);

        long minLongValue = -2147483648;
        long maxLongValue = 2147483647;

        // Integer value - 32 bits - clase wrapper
        System.out.println("Rango del valor de int: " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

        int minIntValue = -2147483648;
        int maxIntValue = 2147483647;

        System.out.println(minValue + maxValue + minShortValue + maxShortValue + minLongValue + maxLongValue + minIntValue + maxIntValue);

        //Tipo long

        long varLong = 3276712313L;

        System.out.println(varLong);
        
        //SCREAMING_SNAKE_CASE 
        //La constante se define con final
        final long ESTA_ES_UNA_CONSTANTE = 3276712313L;
        //ESTA_ES_UNA_CONSTANTE = 3276712314L; No es válida ya que está declarada como constante en la línea de arriba

        System.out.println(ESTA_ES_UNA_CONSTANTE);
        
    }
}

package programacionimperativa.conversiones;

public class Conversiones {
    public static void main(String[] args) {
        //conversiones de tipo promoción
        int value1 = 5;

        System.out.println(value1);

        //conversion de tipo contración
        int value2 = (int)5.99f; //Cast 

        System.out.println(value2);

        //conversion de tipo implícita
        double value3 = 10 + 20.5d;

        System.out.println(value3);
        
    }
    
}

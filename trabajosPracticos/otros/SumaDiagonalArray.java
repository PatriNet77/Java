package trabajospracticos.otros;

public class SumaDiagonalArray {

    public static void main(String[] args) {
        int[][] myArray2D = { 
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int suma = 0;

        for (int i = 0; i < myArray2D.length; i++) {
            suma += myArray2D[i][i];
        }

        System.out.println("El resultado de la suma es: " + suma);
    }
    
}

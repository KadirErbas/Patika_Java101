import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] array =
                {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10,11,12}};

        System.out.println("Matris : ");
        for (int i = 0; i < array.length; i++){
            for (int j  = 0; j < array[0].length; j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

        int[] arr = new int[array.length* array[0].length];
        int[][] array2 = new int[array[0].length][array.length];

        for (int i = 0, x = 0;  i < array.length ; i++){
            for (int j = 0 ; j < array[0].length ; j++){
                arr[x++]=array[i][j];
            }
        }

       for (int i = 0, x = 0;  i < array2.length ; i++){
           for (int j = 0 ; j < array2[0].length ; j++){
               array2[i][j] = arr[x++];
           }
       }

       System.out.println("Transpoze : ");

       for (int i = 0; i < array2.length; i++){
            for (int j  = 0; j < array2[0].length; j++){
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println();
        }

    }
}

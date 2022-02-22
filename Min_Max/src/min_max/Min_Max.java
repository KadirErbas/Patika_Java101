package min_max;
import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
              
        Scanner input = new Scanner(System.in);
        int N;
        int max = 0,min= 0;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print(i + ".Sayıyı Giriniz : ");
            int x = input.nextInt();

            if (x > max) {
                if (min == 0) {
                    min = x;
                }
                max = x;
            }
            if (x < min) {
                if (max == 0) {
                    max = x;
                }
                min = x;
            }
        } 
        System.out.println("En Küçük Sayı: " + min);       
        System.out.println("En Büyük Sayı: " + max);

    
    }    
}

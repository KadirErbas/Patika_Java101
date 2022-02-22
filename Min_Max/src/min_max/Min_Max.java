package min_max;
import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
              
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();
        
        int[] sayiDizisi = new int[n];
                
        for (int i = 0; i < n; i++) {
            System.out.println(i+1+". sayıyı giriniz: ");
            sayiDizisi[i]=input.nextInt();
        }
        int max = sayiDizisi[0] , min = sayiDizisi[0];

        for (int i = 0; i < n; i++) {
            if (sayiDizisi[i] > max) {
                max = sayiDizisi[i];
            }
            if (sayiDizisi[i]< min) {
                min = sayiDizisi[i];
            }
        }
               
        System.out.println("Girdiğiniz en küçük sayı: "+ min);
        System.out.println("Girdiğiniz en büyük sayı: "+ max);
    
    }    
}

package us_alma;
import java.util.Scanner;

public class Us_Alma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.println("Üs olacak sayıyı giriniz: ");       
        int b = input.nextInt();       
        
        int total=1;
        
        for (int i = 0; i < b; i++) {
            total *= a ;
        }
        
        System.out.println("Sonuç: "+total);
    }
    
}

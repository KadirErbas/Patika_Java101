package uc_sayiyi_siralama;
import java.util.Scanner;

public class Uc_Sayiyi_Siralama {
    public static void main(String[] args) {
        int a, b, c;       
        Scanner input = new Scanner(System.in);
        
        System.out.print("1. Sayı: ");
        a = input.nextInt();
        
        System.out.print("2. Sayı: ");
        b = input.nextInt();
        
        System.out.print("3.Sayı: ");
        c = input.nextInt();
        
        if (b < a && c < a) {
            if (c < b) {
                System.out.print("c < b < a");
            }else {
                System.out.print("b < c < a");
            }
        } else if (a < b && c < b) {
            if (c < a) {
                System.out.print("c < a < b");
            }else {
                System.out.print("a < c < b");
            }
        } else {
            if (b < a) {
                System.out.print("b < a < c");
            }else {
                System.out.print("a < b < c");
            }
        }
    
    }    
}

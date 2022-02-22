package Ters_Ucgen;
import java.util.Scanner;

public class Ters_Ucgen {
    
    public static void main(String[] args) {
        
        Scanner klavye= new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int sayi= klavye.nextInt();
        
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = sayi*2+1; j >= 2*i+1; j--) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
               
    }  
}

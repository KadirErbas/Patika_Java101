package uc_ve_dorde_bolunen_sayilar;
import java.util.Scanner;

public class Uc_Ve_Dorde_Bolunen_Sayilar {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        int toplam=0, sayac=0;                        
        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi = input.nextInt();
                
        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;  
                sayac++;
            }              
        }       
        System.out.println("Girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması: "+(double)toplam/sayac);
    }
    
}

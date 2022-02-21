package cift_sayilar_toplamı;

import java.util.Scanner;

public class Cift_Sayilar_Toplamı {

    public static void main(String[] args) {
        /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden 
        çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */
        Scanner input = new Scanner(System.in);
        int number, total=0;
        
        while (true) {            
            System.out.println("Sayi giriniz: ");
            number = input.nextInt();
            if (number%2==1) {
                break;
            } else {
                total += number;
            }          
        }
        
        System.out.println("Girdiğiniz çift sayıların toplamı: "+total);
        
        
        
        
    }
}

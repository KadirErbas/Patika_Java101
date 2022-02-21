package basamak_sayisi;

import java.util.Scanner;

public class Basamak_Sayisi {
    public static void main(String[] args) {
        
        Scanner klavye = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = klavye.nextInt();
        int basamakSayisi = 0, top=0;
        
        while (sayi != 0) {
            top += sayi%10;
            sayi = sayi / 10;
            basamakSayisi++;
        }
        
        System.out.println("Basamak sayısı: "+basamakSayisi);
        System.out.println("Basamak toplamı: "+top);

    }
}

package not_ortalaması_hesaplama;

import java.util.Scanner;

public class Not_Ortalaması_Hesaplama {

    public static void main(String[] args) {
        // Scanner sınıfını tanımladık
        Scanner giris = new Scanner(System.in);

        // Değişkenlerimizi oluşturduk
        int matematik, fizik, kimya, turkce, tarih, muzik;

        // Kullanıcıdan ders notlarını aldık
        System.out.println("Matematik notunuzu giriniz: ");
        matematik = giris.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = giris.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = giris.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = giris.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        tarih = giris.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        muzik = giris.nextInt();
        
        // Girilen değerlerin ortalamasını hesapladık
        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6;
        
        // Ortalamanın 60'tan büyük olup olmama durumuna göre çıktı verdik.
        if (ortalama >= 60) {
            System.out.println("Ortalamanız: "+ortalama+" Geçtiniz.");
        } 
        else {
            System.out.println("Ortalamanız: "+ortalama+" Kaldınız.");
        }
    }

}

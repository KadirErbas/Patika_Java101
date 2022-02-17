package kdv_tutarı_hesaplama;

import java.util.Scanner;

public class KDV_Tutarı_Hesaplama {

    public static void main(String[] args) {
        // Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);
        
        // Değişkenlerimizi oluşturduk.
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
        
        // Kullanıcıdan tutar aldık.
        System.out.println("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();
        
        // Tutarın 1000'den büyük olma durumuna göre KDV oranında değişiklik yaptık. 
        if (tutar > 1000) {
            kdvOran = 0.08;
        }
        // KDV tutarı ile KDV'li tutarı hesapladık.
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;        
        
        // Çıktılarımızı yazdık.
        System.out.println("Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);

    }

}

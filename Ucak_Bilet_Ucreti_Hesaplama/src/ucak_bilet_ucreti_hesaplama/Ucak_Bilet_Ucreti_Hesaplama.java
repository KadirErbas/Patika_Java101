package ucak_bilet_ucreti_hesaplama;

import java.util.Scanner;

public class Ucak_Bilet_Ucreti_Hesaplama {

    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. 
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. 
        Mesafe başına ücret 0,10 TL / km olarak alın. 
        İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın;

*   Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. 
    Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
*   Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
*   Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
*   Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
*   Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        */
        
        Scanner input = new Scanner(System.in);
        int mesafe, secim;
        short yas;
        double ucret = 0;

        System.out.println("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        yas = input.nextShort();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        secim = input.nextInt();

        if (yas < 0 || mesafe < 0 || (secim < 1 || secim > 2)) {
            System.out.println("Hatalı veri girdiniz...");
        } 
        else {
            ucret = mesafe * 0.1;
            if (yas < 12) {
                ucret = ucret * 0.5;
            } 
            else if (yas >= 12 && yas <= 24) {
                ucret = ucret * 0.9;
            } 
            else if (yas > 65) {
                ucret = ucret * 0.7;
            }            
        }
        if (secim == 2) {
            
            ucret = ucret * 1.6;     
            System.out.println("Toplam Tutar = "+ ucret);
        } 
        else {
            System.out.println("Toplam Tutar = "+ ucret);  
        }
    
    }

}

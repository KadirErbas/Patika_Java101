package vucut_kitle_endeksi_hesaplama;

import java.util.Scanner;

public class Vucut_Kitle_Endeksi_Hesaplama {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("kilonuzu giriniz: ");
        double Kilo = klavye.nextDouble();
        System.out.println("metre cinsinden boyunuzu giriniz: ");
        double Boy = klavye.nextDouble();
        double VKİ;
        VKİ = Kilo / (Boy * Boy);
        if (VKİ <= 18.5) {

            System.out.println("Vücut Kitle endeksiniz: " + VKİ + " Zayıfsınız.");

        } else if (VKİ > 18.5 && VKİ <= 24.9) {
            System.out.println("Vücut Kitle endeksiniz: " + VKİ + " kilonuz normal.");

        } else if (VKİ >= 25 && VKİ <= 29.9) {
            System.out.println("Vücut Kitle endeksiniz: " + VKİ + " kilonuz fazla.");
        } else if (VKİ >= 30 && VKİ <= 34.9) {
            System.out.println("Vücut Kitle endeksiniz: " + VKİ + " 2. derece kilolu.");
        } else {
            System.out.println("Vücut Kitle endeksiniz: " + VKİ + " 3. derece kilolu");

        }

    }

}

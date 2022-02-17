package dairenin_alanı_ve_cevresi;

import java.util.Scanner;

public class Dairenin_Alanı_Ve_Cevresi {
    public static void main(String[] args) {
        int yariCap;
        double PI = 3.14, alan, cevre;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin Yari Capini giriniz: ");
        yariCap = input.nextInt();
        alan = PI * yariCap * yariCap;
        cevre = 2 * PI * yariCap;
        System.out.println("Darirenin Alanı: " + alan);
        System.out.println("Dairenin Cevresi: " + cevre);

    }

}

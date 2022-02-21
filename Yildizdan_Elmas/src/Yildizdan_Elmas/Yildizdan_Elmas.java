package Yildizdan_Elmas;

import java.util.Scanner;

public class Yildizdan_Elmas {

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("Sekil kac satir olsun? ");
        int yukseklik = klavye.nextInt();
        int yariyukseklik = (int) (yukseklik / 2 + 1);

        if (yukseklik % 2 == 0) {

            for (int i = 1; i < yariyukseklik; i++) {
                for (int j = 1; j <= yariyukseklik - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            for (int i = yariyukseklik - 1; i >= 1; i--) {
                for (int j = 1; j <= yariyukseklik - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        } else {

            for (int i = 1; i < yariyukseklik + 1; i++) {
                for (int j = 1; j <= yariyukseklik - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            for (int i = yariyukseklik - 1; i >= 1; i--) {
                for (int j = 1; j <= yariyukseklik - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }

    }

}

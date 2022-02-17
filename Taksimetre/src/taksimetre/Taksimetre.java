package taksimetre;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        double km, perkm = 2.20, startPrice = 10, totalPrice;

        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen mesafeyi KM cinsinden giriniz: ");
        km = input.nextDouble();
        totalPrice = km * perkm + startPrice;
        if (totalPrice < 20) {
            totalPrice = 20;
        }
        System.out.println("Tutar: " + totalPrice);

    }

}

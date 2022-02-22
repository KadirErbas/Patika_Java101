package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");

        int n = input.nextInt();
        int sayi1 = 0;
        int sayi2 = 1;
        int sayi3;

        System.out.print(n+" Elemanlı Fibonacci Serisi: "+sayi1 + "  " + sayi2);

        for (int i = 2; i < n; i++) {
            sayi3 = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = sayi3;
            System.out.print("  " + sayi3);
        }

    }

}

package ucgende_alan_bulma;

import java.util.Scanner;

public class Ucgende_Alan_Bulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, u, alan;
        System.out.println("Üçgenin kenar uzunluklarını giriniz: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Kenar uzunluklarını girdiğiniz üçgenin alanı: " + alan);
    }

}

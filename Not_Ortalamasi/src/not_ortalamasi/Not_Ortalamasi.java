package not_ortalamasi;
import java.util.Scanner;

public class Not_Ortalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] dersler = {"Matematik", "Fizik", "Turkce", "Kimya", "Müzik"};
        int total = 0, ort;

        for (int i = 0; i < dersler.length; i++) {
            System.out.println(dersler[0] + " notunu giriniz:(0-100): ");
            int not = input.nextInt();
            if (not >= 0 && 100 >= not) {
                total += not;
            }
        }
        ort = total / dersler.length;
        if (ort >= 55) {
            System.out.println("Ortalamanız: " + ort + " Geçtiniz.");
        } else {
            System.out.println("Ortalamanız: " + ort + " Kaldınız.");
        }

    }

}

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Random random = new Random();

        System.out.print("\nSatır Botununu Giriniz: ");
        int i = input.nextInt();
        System.out.print("Sütun Boyutunu Giriniz: ");
        int j = input.nextInt();
        MineSweeper mine = new MineSweeper(i,j);

        mine.run();

    }
}

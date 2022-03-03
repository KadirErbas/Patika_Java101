import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Elemanları giriniz.");
        for (int i = 0; i < n; i++){
            System.out.print((i+1)+". eleman: ");
            array[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
               if (array[i]<array[j]){
                  int temp = array[j];
                  array[j]= array[i];
                  array[i] = temp;
               }
            }
        }
        System.out.print("Sıralama: ");
        for (int a : array) {
            System.out.print(" "+a);
        }
    }
}

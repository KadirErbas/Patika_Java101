package ebob_ekok_bulma;
import java.util.Scanner;

public class Ebob_Ekok_Bulma {
    public static void main(String[] args) {
        
        Scanner klavye = new Scanner(System.in);
        
        System.out.println("1. sayıyı giriniz: ");
        int sayi1 = klavye.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        int sayi2 = klavye.nextInt();

        int ebob = 0;
        int i=1;
        while (i <= sayi1 && i <= sayi2) {                               
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }           
            i++;
        }
         
        System.out.println("EBOB = " + ebob);
        System.out.println("EKOK = " + sayi1 * sayi2 / ebob);
    }
    
}

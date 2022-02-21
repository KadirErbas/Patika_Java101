package dort_ve_besin_kuvvetleri;
import java.util.Scanner;


public class Dort_ve_Besin_Kuvvetleri {
   
    public static void main(String[] args) {
  
        
        Scanner input = new Scanner(System.in);       
        System.out.println("Sayi giriniz: ");
        int num = input.nextInt();
        System.out.println("4'ün kuvveleri: ");
        
        for (int i = 1; i <= num; i*=4) {                      
                System.out.println(i);                          
        }
        System.out.println("5'in kuvvetleri: ");
        for (int i = 1; i <= num; i*=5) {
            System.out.println(i);
        }
        
    }
    
}

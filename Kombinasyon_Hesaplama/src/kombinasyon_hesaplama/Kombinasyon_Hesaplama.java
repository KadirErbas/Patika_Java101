package kombinasyon_hesaplama;
/*
  Ödev
  N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li 
  kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
  Java ile kombinasyon hesaplayan program yazınız.
  Kombinasyon formülü:
    C(n,r) = n! / (r! * (n-r)!)
*/
import java.util.Scanner;

public class Kombinasyon_Hesaplama {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        int n, r;
        int nFac = 1, rFac = 1, nrFac = 1;
        System.out.println("C(n,r)");
        System.out.print("n'yi giriniz: ");
        n = input.nextInt();       
        System.out.print("r'yi giriniz: ");
        r = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            nFac *= i;      
        }   
        for (int i = 1; i <= r; i++) {
            rFac *= i;
        }
        for (int i = 1; i <= n-r; i++) {
            nrFac *= i;
        }
        System.out.println(nFac/(rFac*nrFac));
    
    }
    
}

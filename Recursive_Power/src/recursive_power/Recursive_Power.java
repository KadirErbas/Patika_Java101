package recursive_power;
import java.util.Scanner;
public class Recursive_Power {
 
    static int getPower(int a,int b){
        if (b == 0) {
            return 1;
        }        
        int result = a * getPower(a, b-1);
        return result;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        System.out.println("Taban değeri giriniz: ");
        int base = input.nextInt();
        System.out.println("Üs değerini giriniz: ");      
        int power = input.nextInt();
        System.out.println("Sonuç: "+getPower(base, power));
    }
    
}

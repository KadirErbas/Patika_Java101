package hesap_makinesi;
import java.util.Scanner;

public class Hesap_Makinesi {

   
    public static void main(String[] args) throws InterruptedException {
        int operation ,num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("1: Toplama \n2: Çıkarma \n3: Çarpma \n4: Bölme" );
        System.out.println("İşlem giriniz(1,2,3,4): ");
        operation = input.nextInt();
        System.out.print("1. Sayıyı giriniz: ");
        num1 = input.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        num2 = input.nextInt();


        switch (operation) {
            case 1:
                System.out.printf("%d + %d = %d",num1,num2,num1+num2);
                break;

            case 2:
                System.out.printf("%d - %d = %d",num1,num2,num1-num2);
                break;
            case  3:
                System.out.printf("%d / %d = %d",num1,num2,num1/num2);
                break;
            case 4:
                System.out.printf("%d x %d = %d",num1,num2,num1*num2);
                break;
            default:
                System.out.println("Geçersiz işlem, lütfen geçerli işlem giriniz!");
        }
                  
       
   
    }
    
}

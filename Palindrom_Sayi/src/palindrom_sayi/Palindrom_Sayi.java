package palindrom_sayi;

import java.util.Scanner;

public class Palindrom_Sayi {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Sayi giriniz: ");
        int a = input.nextInt();
        System.out.println(isPalindrom(a));        
    }
    
    static boolean isPalindrom(int c){
        int temp = c, reverseNumber = 0, lastNumber;
        while (temp != 0) {            
            lastNumber = temp % 10;
            reverseNumber = reverseNumber * 10 + lastNumber;
            temp = temp/10;
        }
        if (c == reverseNumber) {
            return true;
        } 
        return false;
        
    }
}

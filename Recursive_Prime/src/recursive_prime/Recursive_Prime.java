package recursive_prime;

import java.util.Scanner;

public class Recursive_Prime {

    static int isPrime(int num, int i) {

        if (num < 2) 
            return 0;
        
        if (i == 1) 
            return 1;
          else {
            if (num % i == 0) 
                return 0;
             else 
                return isPrime(num, i - 1);            
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number = input.nextInt();

        if (isPrime(number, number / 2) == 0) 
            System.out.print(number + " Asal degildir.");
         else 
            System.out.print(number + " Asal sayidir.");
        
    }

}

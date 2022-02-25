package desene_gore_metot;

import java.util.Scanner;

public class Desene_Gore_Metot {

    static void metot(int n,int temp,boolean down){
        System.out.print(temp+" ");    
        if (temp <= 0) {
            down = false;
        }
        temp = down ? temp - 5: temp + 5;
        if (temp <= n) {
            metot(n, temp, down);
        }
    }
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı: ");       
        int n = input.nextInt();
        System.out.print("Çıktısı: ");
        metot(n,n,true);
        
    }
    
}

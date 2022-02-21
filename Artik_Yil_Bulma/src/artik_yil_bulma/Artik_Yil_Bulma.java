package artik_yil_bulma;

import java.util.Scanner;

public class Artik_Yil_Bulma {    
    public static void main(String[] args) {
        //Kullanicidan degeri alabilmek icin Scanner sinifi projeye dahil edildi.
        Scanner input = new Scanner(System.in);
        
        // Kullanicidan yil alindi.       
        System.out.println("Yıl Giriniz: ");
        int year = input.nextInt();        
        
        //Kullanicidan alinan deger icin gerekli karsilastirmalar yapildi.
        if (year%4==0 || year%400==0){
            System.out.println(year+" bir artık yıldır !");
        }
        else{
            System.out.println(year+" bir artık yıl değildir!");      
        }
        
    }
}

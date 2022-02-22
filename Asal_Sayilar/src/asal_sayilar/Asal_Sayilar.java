package asal_sayilar;

public class Asal_Sayilar {    

    public static void main(String[] args) {
        
        int sayi = 2;
        while (sayi < 100) {
            boolean kontrol = true;            
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    kontrol = false;
                    break;
                }
            }
            if (kontrol) {
                System.out.print(sayi + " ");
            } 
            sayi++;
        }

    }   
}

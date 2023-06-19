package manavkasa;

import java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args) {
        // meyvelerin kilo bazında fiyatını tanımlama
        double kiloArmut = 2.14, kiloElma = 3.67, kiloDomates = 1.11, kiloMuz = 0.95, kiloPatlican = 5.00;
        
        double alınanArmut, alınanElma, alınanDomates, alınanMuz, AlınanPatlican;
        
        Scanner input = new Scanner(System.in);

        // kullanıcıdan aldığı ürünlerin kilosunu alma işlemleri
        System.out.println("Kaç Kilo Armut: ");
        alınanArmut = input.nextDouble();
        
        System.out.println("Kaç Kilo Elma: ");
        alınanElma = input.nextDouble();

        System.out.println("Kaç Kilo Domates: ");
        alınanDomates = input.nextDouble();

        System.out.println("Kaç Kilo Muz: ");
        alınanMuz = input.nextDouble();

        System.out.println("Kaç Kilo Patlıcan: ");
        AlınanPatlican = input.nextDouble();

        // tutarın hesaplanıp yazdırılma işlemi
        System.out.println("Tutar: "+((alınanArmut*kiloArmut)+(alınanElma*kiloElma)+(alınanDomates*kiloDomates)+(alınanMuz*kiloMuz)+(AlınanPatlican*kiloPatlican)));
    }

}

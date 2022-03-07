package palindromik_kelime;

import java.util.Scanner;

public class Palindromik_Kelime {

    public static void main(String[] args) {
        
        Scanner klavye = new Scanner(System.in);
        System.out.print("Kelime Yazın: ");
        String kelime = klavye.nextLine();
        String kelimeninTersi = "";
        
        for (int i = (kelime.length() - 1); i >= 0; i--) {
            kelimeninTersi = kelimeninTersi + kelime.charAt(i);
        }
        
        System.out.println("Kelimenin Tersi: " + kelimeninTersi);
       
        if (kelime.equals(kelimeninTersi)) {
            System.out.println("Kelimeniz polindromiktir. ");
        } else {
            System.out.println("Kelimeniz polindromik değildir.");
        }
    }

}

package atm_ıslemleri;
import java.util.Scanner;

public class Atm_Islemleri { 
    public static void main(String[] args) {
        
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 3000;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("patika123")) {
                System.out.println("Merhabalar, PATIKA Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("\n1-Para yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak İstediğiniz Para Miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("İşlem Başarılı.\nYeni bakiyeniz: "+balance);
                            break;
                        case 2:
                            System.out.print("Çekmek İstediğiniz Para Miktarı: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz.");
                            } else {
                                balance -= price;
                                System.out.println("İşlem başarılı.\nYeni bakiyeniz: "+ balance);
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut Bakiyeniz: " + balance);
                            break;
                    }

                } while (select != 4);
                System.out.println("Tekrar Bekleriz...");
                break;
            }
            else{
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre.");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur. Lütfen Bankamız İle İletişime Geçiniz.");
                } else {
                    System.out.println("Tekrar Deneyiniz...\nKalan Hakkınız: " + right);
                }
            }
        }
   
    }  
}

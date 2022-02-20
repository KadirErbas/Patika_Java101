
package kullanici_girisi;

import java.util.Scanner;


public class Kullanici_Girisi {

    
   
        public static void main(String[] args) {
        String userName = "patika", password = "java123";
        Scanner input = new Scanner(System.in);        
        while (true) {
            System.out.println("Kullanıcı adınız: ");
            String userNameEntered = input.nextLine();
            System.out.println("Şifreniz: ");
            String passwordEntered = input.nextLine();
            if (userNameEntered.equals(userName) && passwordEntered.equals(password)) {
                System.out.println("Giriş Yaptınız!");
                break;
            } else if (userNameEntered.equals(userName) && !passwordEntered.equals(password)) {
                System.out.println("Şifre Yanlış! Şifrenizi sıfırlamak ister misiniz (e/h)");
                String cevap = input.nextLine();
                if (cevap.equals("e")) {
                    System.out.println("Yeni şifrenizi giriniz: ");

                    while (true) {
                        passwordEntered = input.nextLine();
                        if (passwordEntered.equals(password)) {
                            System.out.println("Şifreniz önceki şifrenizle aynı!\nLütfen başka bir şifre giriniz: ");
                        } else if (!passwordEntered.equals(password)) {
                            password = passwordEntered;
                            System.out.println("Şifreniz Değiştirildi.");
                            
                            break;
                        }
                    }
                } else if (cevap.equals("h")) {
                    System.out.println("Tekrar bekleriz.");
                    break;
                }
            } else {
                System.out.println("Bilgileriniz yanlış! Tekrar deneyiniz.");
            }
        }


        /*
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
        ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
        şifreler aynı ise ekrana "Şifre oluşturulamadı,
        lütfen başka şifre giriniz."
        sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */
    }

    }
    


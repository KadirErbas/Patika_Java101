import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = {15,12,788,1,-1,-778,2,0};

        // dizimizi yazdırdık.
        System.out.println(Arrays.toString(array));

        // diziyi küçükten büyüğe doğru sıraladık.
        Arrays.sort(array);

        // min'e en düşük, max'a ise en yüksek sayıyı verdik.
        int min = array[0], max = array[array.length-1];

        // kullanıcıdan sayı aldık.
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();

        // kullanıcıdan aldığımız sayı dizinin en küçük sayısıdan daha küçük ise ya da dizinin en büyük sayısından daha büyük ise uyarı verdik.
        if ( number < array[0] || number > (array[array.length - 1])) {
            System.out.println("Aralikta Olmayan Bir Deger Girdiniz!");
            System.out.println("Dizi  ==>  "+Arrays.toString(array));
        }
        // kullanıcıdan alınan sayı dizi aralığında ise burdan devam ettik.
        else{
            int i = 0, j = array.length-1;

            // soldan sağa doğru dizinin elemanı kullanıcının girdiği sayıya eşit ya da büyük oluncaya kadar dizinin elemanını min'e atadık.
            while (array[i] < number){
                min = array[i];
                i++;
            }
            // sağdan sola doğru dizinin elemanı kullanıcının girdiği sayıya eşit ya da küçük oluncaya kadar dizinin elemanını min'e atadık.
            while (array[j] > number){
                    max = array[j];
                    j--;
                }
            // yazdırma işlemi.
            System.out.println("Girilen sayıdan küçük en yakın sayı: "+ min);
            System.out.println("Girilen sayıdan büyük en yakın sayı: "+ max);

        }

    }
}

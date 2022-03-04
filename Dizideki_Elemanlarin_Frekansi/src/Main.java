import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        int[] array = {10, 20, 20, 10, 10, 20, 5, 20, 7, 7, 30};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int sayac = 1;
        System.out.println("Tekrar Sayıları");
        for (int i = 0, j = i+1; i < array.length && j< array.length; i++, j++){
            if (array[i] == array[j]){
                sayac++;
            }
            else if (array[i] != array[j] || i == array.length) {
                System.out.println(array[i]+" sayısı "+ sayac +" kere tekrar edildi.");
                sayac=1;
            }
        }

    }

}

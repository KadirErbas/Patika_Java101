import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        int[] array = {10, 20, 20, 10, 10, 20, 5, 20, 7, 7, 30};
        // dizimizi sıralıyoruz
        Arrays.sort(array);
        // dizimizin sıralandıktan sonraki hali
        System.out.println(Arrays.toString(array));
        // elemanların kaç kez tekrar edildiğini tutar
        int sayac = 1;
        System.out.println("Tekrar Sayıları");
        // dizimizin solundan başlayıp bi sonraki değer ile aynı olup olmadığını kontrol ediyoruz. 
        // aynı ise sayacı 1 arttırıyoruz. aynı değil ise sayacı 1 den başlatıyoruz
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

import java.util.Arrays;
public class Main {

    static  boolean isFind(int arr[], int i){
        for (int a : arr) {
            if (a == i){
                return true;
            }
        }
        return  false;
    }
    public static void main(String[] args) {

        int[] array = {6, 1, 3, 4, 6, 8, 4, 8, 6, 99, 44, 20};
        int[] duplicate = new int[array.length];
        int startIndex = 0;

        for (int i = 0 ; i < array.length; i++){
            for (int j = 0 ; j < array.length; j++ ){
                if ((array[j] % 2 == 0) && (array[i] == array[j]) && (i != j) && !isFind(duplicate,array[i])){
                    duplicate[startIndex++] = array[j];
                    break;
                }
            }
        }
        System.out.print("Kendini tekrar eden sayılar: ");
        for (int i : duplicate) {
            if (i != 0){
                System.out.print(i+" ");
            }

        }
    }
}

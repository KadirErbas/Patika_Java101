public class Main {
    public static void main(String[] args) {
        double[] list = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int i = 0 ; i < list.length; i++){
            sum = sum + (1/list[i]);
            System.out.printf("%s / %s = %s\n",i, list[i], sum);
        }
        double avarage = list.length / sum  ;
        System.out.println("Harmonik Ortalama: " + avarage);

    }
}

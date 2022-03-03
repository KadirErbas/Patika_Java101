public class Main {
    public static void main(String[] args) {
        String[][] array = new String[7][4];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j< array[0].length; j++){
                if (j==0 || j == 3) {
                    array[i][j] = " * ";
                }
                else if (i == 0 || i == 3 || i == 6){
                    array[i][j] = " * ";

                }
                else {
                    array[i][j] = "   ";

                }
            }
        }
        for (String[] i : array) {
            for (String j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

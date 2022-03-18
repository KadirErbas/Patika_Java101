/*
Oyun Kuralları :
+ 1-) Oyun metin tabanlıdır.
+ 2-) Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
3-) Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
+ 4-) Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli.
    Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı.
    Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
+ 5-) Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
+ 6-) Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
+ 7-) Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
8-) Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
9-) Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.
*/

import java.util.Scanner;

public class MineSweeper {

    String[][] map;
    String[][] mapWithBomb;
    int rowNumber;
    int colNumber;


    MineSweeper(int rowNumber, int colNumber ){

        this.rowNumber = rowNumber;
        this.colNumber = colNumber;

        // oyunun oynandığı harita
        this.map = new String[rowNumber][colNumber];

        for (int i = 0; i < this.rowNumber; i++) {
               for (int j = 0; j < this.colNumber; j++) {
                   this.map[i][j] = "-";
               }
        }

        // bombalı harita
        this.mapWithBomb = new String[rowNumber][colNumber];

        for (int i = 0; i < this.rowNumber; i++) {
               for (int j = 0; j < this.colNumber; j++) {
                   this.mapWithBomb[i][j] = "-";
               }
        }
        // bombaları yerleştir
        for (int i = 0; i < (mapWithBomb.length * mapWithBomb[0].length) / 4; i++) {
            this.mapWithBomb[(int) (Math.random() * mapWithBomb.length)][(int) (Math.random() * mapWithBomb[0].length)] = "*";
        }

    }

    public void run() {
        System.out.println("Mayınların Konumu");
        printMap(mapWithBomb);

        System.out.println("\nMayın Tarlası Oyuna Hoşgeldiniz!");
        printMap(map);

        while (isContinuing()){
            System.out.println("============");
            printMap(map);
        }

    }


    boolean isContinuing(){

        Scanner input = new Scanner(System.in);
        if (isWin(map)){
            System.out.println("Tebrikler kazandınız! ");
            return false;
        }
        System.out.print("\nSatır Giriniz: ");
        int i = input.nextInt();
        System.out.print("Sütun Giriniz: ");
        int j = input.nextInt();

        if ((map.length > i &&  i >= 0) && (map[0].length > j && j >= 0)){
            if (mapWithBomb[i][j].equals("*")){
                System.out.println("Kaybettiniz!");
                return false;
            }
            else {
                int sayac = 0;

                if (i==0 && j==0){
                    if (mapWithBomb[i][j+1].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i+1][j+1].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i+1][j].equals("*")) {
                        sayac++;
                    }
                    map[i][j]=String.valueOf(sayac);
                }
                else if(i == 0  &&  j == map[0].length-1){
                    if (mapWithBomb[i][j-1].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i+1][j-1].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i+1][j].equals("*")) {
                        sayac++;
                    }
                    map[i][j]=String.valueOf(sayac);
                }
                else if(i == map.length-1  &&  j == map[0].length-1){
                    if (mapWithBomb[i][j-1].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i-1][j-1].equals("*")){
                        sayac++;
                    }
                   if(mapWithBomb[i-1][j].equals("*")) {
                        sayac++;
                    }
                    map[i][j]=String.valueOf(sayac);
                }
                else if(i == map.length  &&  j == 0){
                    if (mapWithBomb[i-1][j].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i-1][j+1].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i][j+1].equals("*")) {
                        sayac++;
                    }
                    map[i][j]=String.valueOf(sayac);
                }
                else if(i == 0){
                    if (mapWithBomb[i][j-1].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i+1][j-1].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i+1][j].equals("*")) {
                        sayac++;
                    }
                    if(mapWithBomb[i+1][j+1].equals("*")) {
                        sayac++;
                    }
                    if(mapWithBomb[i][j+1].equals("*")) {
                        sayac++;
                    }
                    map[i][j]=String.valueOf(sayac);
                }
                else if(j == map[0].length-1){
                    if (mapWithBomb[i-1][j].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i-1][j-1].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i][j-1].equals("*")) {
                        sayac++;
                    }
                    if(mapWithBomb[i+1][j-1].equals("*")) {
                        sayac++;
                    }
                    if(mapWithBomb[i+1][j].equals("*")) {
                        sayac++;
                    }
                    map[i][j]=String.valueOf(sayac);
                }
                else if(i == map.length-1){
                    if (mapWithBomb[i][j+1].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i-1][j+1].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i-1][j].equals("*")) {
                        sayac++;
                    }

                    map[i][j]=String.valueOf(sayac);
                }
                else if(j == 0){
                    if (mapWithBomb[i-1][j].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i-1][j+1].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i][j+1].equals("*")) {
                        sayac++;
                    }
                    if(mapWithBomb[i+1][j+1].equals("*")) {
                        sayac++;
                    }
                    if(mapWithBomb[i+1][j].equals("*")) {
                        sayac++;
                    }
                    map[i][j]=String.valueOf(sayac);
                }
                else if( j != map[0].length-1 &&  i != map.length-1){
                    if (mapWithBomb[i-1][j-1].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i-1][j].equals("*")){
                        sayac++;
                    }
                    if(mapWithBomb[i-1][j+1].equals("*")) {
                        sayac++;
                    }
                    if(mapWithBomb[i][j+1].equals("*")) {
                        sayac++;
                    }
                    if(mapWithBomb[i+1][j+1].equals("*")) {
                        sayac++;
                    }
                    if(mapWithBomb[i+1][j].equals("*")) {
                        sayac++;
                    }
                    if(mapWithBomb[i+1][j-1].equals("*")) {
                        sayac++;
                    }
                    if(mapWithBomb[i][j-1].equals("*")) {
                        sayac++;
                    }
                    map[i][j] = String.valueOf(sayac);
                }

            }

        }

        else {
            System.out.println("Sınırların dışına çıktınız! ");
            return true;
        }

        return true;
    }
    boolean isWin(String arr[][]){
        int sayac = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j= 0; j < arr[0].length; j++){
                if (arr[i][j].equals("-")){
                    sayac++;
                }
            }
        }
        if (sayac == mapWithBomb.length * mapWithBomb[0].length / 4 ){
            return true;
        }
        return false;
    }

    // haritayı göster.
    public void printMap(String[][] map){

        for (int i = 0; i < map.length; i++){
            for (int j= 0; j < map[0].length; j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }

    }




}

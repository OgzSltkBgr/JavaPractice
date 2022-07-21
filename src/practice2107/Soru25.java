package practice2107;

import java.util.Arrays;

public class Soru25 {
    public static void main(String[] args) {
        /*
        Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
​
    Array: [12,15,43,23,56,76,78,90,77,43]
​
    Aranan değer:56
​
    Beklenen Çıktı:
    56 sayısı arrayin 4. elemanı
​
         */

        int sayilar [] = {12,15,43,23,56,76,78,90,77,43};
        int arananSayi = 12;

        Arrays.sort(sayilar);
        System.out.println("Girdiginiz rakam sayilar Arrayinin = " + Arrays.binarySearch(sayilar, arananSayi)+ ". elemani");

    }
}

package practice2307;

import java.util.Arrays;

public class OdevSorusu1 {
    public static void main(String[] args) {
        /*
        1 den 10 a kadar sayılar oluşan dizide eksik olan sayıyı döndüren metodu oluşturunuz.
        ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
        ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
        ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10
        */
        int arr[] = {1, 2, 3, 5, 6, 7, 8, 10, 9};
        int arr1[] = {7, 2, 3, 10, 5, 9, 1, 4, 8};
        int arr2[] = {7, 5, 1, 2, 4, 6, 8, 3, 9};

        int toplam=0;
        int toplamArr=55;

        for (int i = 0; i <arr.length ; i++) {
            toplam += arr[i];
        }
        System.out.println("Arrayin kayip elemani : " + (toplamArr-toplam));

    }
}

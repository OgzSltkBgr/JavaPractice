package practice2507;

import java.util.Arrays;

public class Soru38 {
    public static void main(String[] args) {
/*
 Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.
​
    Örnek -
    farkBul([10, 15, 20, 2, 10, 6])
    18
 */

        int arr []={10, 15, 20, 2, 10, 6};

        farkBul(arr);
        System.out.println(farkBul(arr));
    }

    private static int farkBul(int[] arr) {
        int fark;
        Arrays.sort(arr);
        fark = arr[arr.length-1]-arr[0];
        return  fark;
    }
}

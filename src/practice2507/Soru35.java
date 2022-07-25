package practice2507;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru35 {
    public static void main(String[] args) {
        /*
        Methoda iki sayı girelim ve  bize bir array dönsün.
     Array elemanları 1.sayının 2. sayı kadar kendisi ile
     toplamından oluşsun.
​
    Test Data:
    arrayOfMultiples(7, 5)
​
    sonuç: [7,14,21,28,35]
​
         */

        int temp =7;
        int uzunluk =5;

        List<Integer> list = new ArrayList<>();

        for (int i = temp; i <= temp*uzunluk ; i+=temp) {
            list.add(i);
        }
        System.out.println(list);
    }
}

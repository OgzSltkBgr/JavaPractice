package practice2307;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class OdevSorusu {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random rnd = new Random();
        List<Integer> result = new ArrayList<>();
        int arr1[] = new int[9];

        while (result.size() < 9) {
            for (int i = 0; i < arr1.length; i++) {

                arr1[i] = 1+rnd.nextInt(10);
                Arrays.sort(arr1);

                if (!result.contains(arr1[i]) && arr1[i]!=0) {
                    result.add(arr1[i]);
                }
            }
        }
        System.out.println(result);
        int toplam=0;
        int toplamArr=55;

        for (int i = 0; i <arr1.length ; i++) {
            toplam += arr1[i];
        }
        System.out.println(toplamArr-toplam);
    }
}
package practice2307;

import java.util.Arrays;

public class OdevSorusu {
    public static void main(String[] args) {
        int[] input = {7, 5, 1, 2, 4, 6, 8, 3, 9};
        arrayIcindeEksikElementiBulma(input);
    }
    public static int[] arrayIcindeEksikElementiBulma( int[] input) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(input);
        int [] eksikEleman=new int[1];
        for (int i = 0; i <arr.length ; i++) {
            if (Arrays.binarySearch(input, arr[i])<0) {
                eksikEleman[0]=arr[i];
            }
        }
        System.out.println(Arrays.toString(eksikEleman));
        return eksikEleman;
    }

}
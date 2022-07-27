package practice2307;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class OdevSorusu {
    public static void main(String[] args) {

        int input [] = new int[9];
        arrayIcindeEksikElementiBulma(input);
    }
    public static int[] arrayIcindeEksikElementiBulma( int[] input) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random rnd = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input.length ; i++) {

        }





        System.out.println(Arrays.toString(input));
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
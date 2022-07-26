package practice2507;

import java.util.Arrays;

public class Soru33 {
    public static void main(String[] args) {
        /*
        Bir arrayi tersine çeviren  method yazınız.
​
    Test Data:
​
    reverse [1, 2, 3, 4]
    return  [4, 3, 2, 1]
         */
        int arr[] = {1, 2, 3, 4};
        arrayTersCevir(arr);
    }

    private static void arrayTersCevir(int[] arr) {

        int tersArr[]=new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            tersArr[(arr.length-1)-i]=arr[i];
        }
        System.out.println(Arrays.toString(tersArr));

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}

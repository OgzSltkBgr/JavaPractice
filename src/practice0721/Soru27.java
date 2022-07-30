package practice0721;

import java.util.Arrays;

public class Soru27 {
    public static void main(String[] args) {
        /*
         27----
    Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
​
    Array: [1232,2345,5467,678,3454,2312,3451]
         */

        int arr []={1232,2345,5467,678,3454,2312,3451};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("arr arayinde en buyuk ikinci sayi : "+ arr[arr.length-2]);


    }
}

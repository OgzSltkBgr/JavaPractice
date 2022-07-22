package practice2207;

import java.util.Arrays;

public class ReplitArray2 {
    public static void main(String[] args) {
        /*
        cumleyi terse ceviren bir array yaziniz

        inpu : Coding is greate.
        output :.etaerg si gnidoC

         */

        String str = "Coding is greate.";
        String[]arr=str.split("");
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }

    }
}

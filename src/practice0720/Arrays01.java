package practice0720;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        Verilen bir int dizisindeki elemanlarin karelerini bulun
        ex/ {2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
         */

        int [] arr = {2,6,4,5,8,9};

        for (int i = 0; i <arr.length ; i++) {
                 arr[i] *= arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}

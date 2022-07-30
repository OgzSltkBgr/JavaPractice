package practice0720;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        /*
        HeySiri olan stringi ByeSiri ye ceviriniz
        Bunu da array icerisine ekleyiniz
         */

        String str = "HeySiri";
        str= str.replace("Hey","Bye");

        String arr[] = new String[1];
        arr[0] =str;

        System.out.println(Arrays.toString(arr));
    }
}

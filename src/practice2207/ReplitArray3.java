package practice2207;

import java.util.Arrays;

public class ReplitArray3 {
    public static void main(String[] args) {

        String str="ade1r4d3";
        sayilariTopla(str);

        String arr[]=str.split("");

        System.out.println(Arrays.toString(arr));

        // Character.isDigit(arr);
    }

    public static void sayilariTopla(String str) {

        int toplam=0;

        toplam+=Integer.parseInt(str.replaceAll("\\D",""));
        System.out.println(toplam);
        int total=0;

        while(toplam>0){
            total+=toplam%10;
            toplam/=10;
        }
        System.out.println(total);

    }
}

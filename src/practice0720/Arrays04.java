package practice0720;

import java.util.Scanner;

public class Arrays04 {
    public static void main(String[] args) {
        /*
        Kullanicidan aldginiz 8 elemanli arrayin icinde
        kac tane 3 e bolunebilen sayi vardir ? negatif sayilar dahil
         */
        int arr [] = new int [8];
        Scanner scan = new Scanner(System.in);
        int count =0;
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i + ". indexdeki sayiyi giriniz :");
            arr[i] = scan.nextInt();

            if(arr[i]%3==0) {
                count++;
            }
        }
        System.out.println("3 e bolunebilen sayi : " + count);




    }
}

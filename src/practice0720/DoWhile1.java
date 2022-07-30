package practice0720;

import java.util.Scanner;

public class DoWhile1 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir kelime al kelimenin karakteri tek harfli ise ortadaki karakteri yazdir
        cift karakterli ise kelime yanlis girdiniz diye uyari verin
         */
        Scanner scan = new Scanner(System.in);
        String str = "";


        do {
            System.out.println("Lutfen bir kelime giriniz");
             str = scan.nextLine();
             if (str.length()%2==1){
                 System.out.println(str.charAt(str.length()/2));

             }else {System.out.println("yanlis giris yaptiniz");

             }
        }while(str.length()%2!=1);

    }
}

package practice;

import java.util.Scanner;

public class Soru16 {
    public static void main(String[] args) {
        /*
         Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.
​
    Test Data:
    java is fun
​
    Beklenen Çıktı:
    JAVA IS FUN
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");
        String str = scan.nextLine();
        String buyukStr =str.toUpperCase();

        System.out.println(buyukStr);

    }
}

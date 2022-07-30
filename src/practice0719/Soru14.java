package practice0719;

import java.util.Scanner;

public class Soru14 {
    public static void main(String[] args) {
        /*
        Girilen iki String veriyi karşılaştıran Java kodu yazınız.

    Test data:
    1. String : techproed.com
    2. String : Techproed.com
​
    Beklenen Çıktı:
    False
​
    Test data:
    1. String : techproed.com
    2. String : techproed.com
​
    Beklenen Çıktı:
    true
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk kelimeyi giriniz");
        String input1 = scan.nextLine();
        System.out.println("Lutfen ikinci kelimeyi giriniz");
        String input2 = scan.nextLine();

        if (input1.equals(input2)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}

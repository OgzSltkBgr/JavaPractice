package practice2507;

import java.util.Scanner;

public class Soru32 {
    public static void main(String[] args) {
        /*
        İki integer sayının eşitliğini kontrol eden java methodunu yazınız.
​
    num1 = num2 => true
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int sayi1 =scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 =scan.nextInt();

        sayilarEsitMi(sayi1,sayi2);
    }

    private static void sayilarEsitMi(int sayi1, int sayi2) {

        if (sayi1 == sayi2) {
            System.out.println(true);
        }else System.out.println(false);
    }
}

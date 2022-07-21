package practice1907;

import java.util.Scanner;

public class Soru17 {
    public static void main(String[] args) {
        /*
        Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.
​
    Test data:
    12,24,34
​
    Beklenen Çıktı:
    12
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int sayi1= scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2= scan.nextInt();

        System.out.println("Lutfen ucuncu sayiyi giriniz");
        int sayi3= scan.nextInt();
        enKucukSayi(sayi1,sayi2,sayi3);    }
    private static void enKucukSayi(int sayi1, int sayi2, int sayi3) {


        if (sayi1>sayi2 && sayi1>sayi3 && sayi2>sayi3) {
            System.out.println("Girilen en kucuk sayi : " +sayi3);
        }else if (sayi1>sayi2 && sayi1>sayi3 && sayi3>sayi2)   {
            System.out.println("Girilen en kucuk sayi : " +sayi2);
        }else if (sayi2>sayi1 && sayi2>sayi3 && sayi3>sayi1) {
            System.out.println("Girilen en kucuk sayi : " +sayi1);
        }else if (sayi2>sayi1 && sayi2>sayi3 && sayi1>sayi3) {
            System.out.println("Girilen en kucuk sayi : " +sayi3);
        }else if (sayi3>sayi2 && sayi3>sayi1 && sayi1>sayi2){
            System.out.println("Girilen en kucuk sayi : " +sayi2);
        }else if (sayi3>sayi2 && sayi3>sayi1 && sayi2>sayi1) {
            System.out.println("Girilen en kucuk sayi : " +sayi1);
        }
    }
}

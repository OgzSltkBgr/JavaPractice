package practice1907;

import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {
        /*
        Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.
​
    Test Data:
    Java is fun
​
​
    Beklenen Çıktı
    0. pozisyondaki karakter : J
​
    5. pozisyondaki karakter : i
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen string giriniz");
        String str = scan.nextLine();

        System.out.println("Lutfen kacinci index i gormek istediginizi giriniz");
        int input = scan.nextInt();

        for (int i = input; i <=input ; i++) {
            System.out.println(str.charAt(input));
        }
    }
}

package practice2507;

import java.util.Scanner;

public class Soru30 {
    public static void main(String[] args) {
        /*
        Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.
​
    Test Data:
    birinci binary number: 100010
    ikinci  binary number: 110010
​
    Beklenen Çıktı:
    1010100
         */

        int i = 0, kalan = 0;
        int[] toplam = new int[20];
        Scanner scan= new Scanner(System.in);
        System.out.print("birinci sayiyi giriniz: ");
        long binary1 = scan.nextLong();
        System.out.print("ikinci sayiyi giriniz: ");
        long binary2 = scan.nextLong();
        while (binary1 != 0 || binary2 != 0)
        {
            toplam[i++] = (int)((binary1 % 10 + binary2 % 10 + kalan) % 2);
            kalan = (int)((binary1 % 10 + binary2 % 10 + kalan) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (kalan != 0) {
            toplam[i++] = kalan;
        }
        --i;
        System.out.print("verilen binary sayilarin toplami: ");
        while (i >= 0) {
            System.out.print(toplam[i--]);
        }
        System.out.print(" ");
    }
}

package practice0724;

import java.util.Scanner;

public class ReplitArray11UcuncuCozum {
    public static void main(String[] args) {
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

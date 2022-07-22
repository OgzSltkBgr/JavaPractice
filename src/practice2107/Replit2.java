package practice2107;

import java.util.Scanner;

public class Replit2 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
Input :
30
40
Beklenen Cikti:
30 ve 40 icin GCD = 10 ebob    10x3x4=120
30 ve 40 icin LCM = 120
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();
        int ebob=0;

        for (int i = 1; i <sayi2 ; i++) {
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
        }
        }System.out.println("ebob :"+ebob);
        int ekok=0;
        int carpim=sayi1*sayi2;
        for (int i = carpim; i >0 ; i--) {
        if (i%sayi1==0 && i%sayi2==0) {
        ekok=i;
             }
        }
            System.out.println("ekok :" +ekok);
    }
}

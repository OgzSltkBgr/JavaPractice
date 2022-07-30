package practice0724;

import java.util.Scanner;

public class ReplitBinary {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ilk binary sayisini giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen ikinici binary sayisini giriniz");
        int sayi2=scan.nextInt();
        int kalan=0;
        int toplam[]=new int[9];
        int i =0;

        while (sayi1!=0 && sayi2!=0) {
                toplam[i++]=(sayi1%10+sayi2%10+kalan)%2;
                kalan=(sayi1%10+sayi2%10+kalan)/2;
                sayi1/=10;
                sayi2/=10;
        }
        if(kalan!=0 ){
            toplam[i++]=kalan;
        }
        System.out.println("Verilen sayilarin binary toplami : ");
       --i;
        while(i>=0){
            System.out.print(toplam[i--]);
        }
        System.out.println();
    }
}

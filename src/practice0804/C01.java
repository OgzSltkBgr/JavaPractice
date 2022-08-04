package practice0804;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        /* TASK :
         * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
         * METHOD create ediniz.
         *
         * Ör: Input : 50
         *     Bolenler : 2,5,10,20,50
         *     Asal Bolenler: 2,5
         *     En buyuk asal carpan: 5
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int num = scan.nextInt();
        List<Integer> bolenler= new ArrayList<>();
        List<Integer> asal= new ArrayList<>();
        int enBuyukAsal=0;
        boolean asalMi=true;

        if(num>0){
            for (int i = 2; i <=num ; i++) {
                if(num%i==0){
                    bolenler.add(i);
                }
            }
            System.out.println(bolenler);
        }
        for (int i = 0; i <bolenler.size() ; i++) {
            asalMi=true;
            for (int j = 2; j <bolenler.get(i) ; j++) {//listedki asalları bulan bir for dögüsü
                if (bolenler.get(i)%j==0){
                    asalMi=false;
                    break;
                }
            }
            if (asalMi){
                asal.add(bolenler.get(i));//liste sıralı olduğu için en son asal olan sayı en büyük asal sayımız olacak
            }
        }System.out.println(asal);
        enBuyukAsal=asal.get(asal.size()-1);
        System.out.println(enBuyukAsal);
    }
}

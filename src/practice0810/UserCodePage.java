package practice0810;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UserCodePage {

    public static void main(String[] args) {
        girisSayfasi();
    }
    static Scanner scan = new Scanner(System.in);
    static int sayiUretAr []=new int[4];
    public static void girisSayfasi(){
        System.out.println("Aciklama icin 1'i, oyun icin 2'yi giriniz");
        char giris=scan.nextLine().charAt(0);
        switch (giris) {
            case '1':
                aciklamaGetir();
                sayiUret();
                sayiKontrol();
                break;
            case '2':
                sayiUret();
                sayiKontrol();
                break;
            default:
                System.out.println("Yanlis deger girdiniz");
                girisSayfasi();
        }

    }

    private static void sayiKontrol() {
        System.out.println("OYUN BASLIYOR");
        int [] girilenSayiArr= new int[4];
        int arti;
        int eksi;
        int toplamBilinen;
        int kacKeredeBuldu=0;
        int test;

        do {
            arti=0; eksi=0; toplamBilinen=0; kacKeredeBuldu=0; test=0;
            System.out.println("Lutfen 4 basamakli rakamlari birbirinden farkli sayi giriniz");
            int girilensayi= scan.nextInt();
            girilenSayiArr[3]=girilensayi%10;
            girilenSayiArr[2]=(girilensayi/10)%10;
            girilenSayiArr[1]=(girilensayi/100)%10;
            girilenSayiArr[0]=girilensayi/1000;
            for (int i = 0; i <4 ; i++) {
                for (int j = 0; j <4 ; j++) {
                    if (girilenSayiArr[i]==girilenSayiArr[j]) {
                        test++;
                    }
                }
            }
            if(girilensayi<1000 || girilensayi>9999) {
                System.out.println("Girilen "+ girilensayi+ " sayisi 4 basamakli degildir");
            }else if (test>4){
                System.out.println("Girilen "+ girilensayi+ " sayisi icinde ayni rakam vardir");
            }else{
                for (int i = 0; i <4 ; i++) { // random sayi ile kullanicinin girdigi sayi arasinda kac tane ayni rakam var
                    for (int j = 0; j <4 ; j++) {
                        if (girilenSayiArr[i]==sayiUretAr[j]) {
                            toplamBilinen++;
                        }
                    }

                }
                for (int i = 0; i <4 ; i++) {
                    if(girilenSayiArr[i]==sayiUretAr[i]){
                        arti++;
                    }
                }
                eksi=toplamBilinen-arti;
                kacKeredeBuldu++;
                if(arti==4){
                    System.out.println("Sayiniz : " + Arrays.toString(girilenSayiArr));
                    System.out.println("+ "+ arti + " Tebrikler, " + kacKeredeBuldu + ". denemede buldunuz");
                    System.out.println("tutulan sayi : " + Arrays.toString(sayiUretAr));
                }else{
                    System.out.println("+ "+ arti+", - "+eksi);
                }
            }



        }while (arti<4);
    }

    public static void sayiUret(){

        int test=0;
        int min=1000;
        int max=9999;
        Random rnd=new Random();
        do {
            int sayi=rnd.nextInt(max-min);

            for (int i = 3; i >=0 ; i--) {
                sayiUretAr[i]=sayi%10; // birler basamagi
                sayi/=10;
            }
            for (int i = 0; i <4 ; i++) {
                for (int j = 0; j <4 ; j++) { //
                    if(sayiUretAr[i]==sayiUretAr[j]) {
                        test++;
                    }
                }
            }
            if (test==4){
                break;
            }else{
                test=0;
            }



        }while (test<4);
        //System.out.println(Arrays.toString(sayiUretAr));
    }

    static void aciklamaGetir() {
        int n;
        FileInputStream fis =null;
        try {
            fis =new FileInputStream("src/practice0810/Aciklama.txt");
            while ((n=fis.read())!=-1) {
                System.out.print((char)n);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya Bulunamadı");
        }catch (IOException e) {
            System.out.println("Dosya Bulunamad");
        }
        System.out.println();
    }
}

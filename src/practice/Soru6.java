package practice;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        /*
          Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
           değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
         */
        String sesliHarf = "a,e,i,o,u";
        String sessizHarfler = "zxcvbnmlkjhgfdsqwrtyp";

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        String harf = scan.next().toLowerCase();

        if(harf.length()==1){
            for (int i = 0; i < sesliHarf.length() ; i++) {
                if(sesliHarf.contains(harf)){
                    System.out.println("sesli harf");
                    break;
                }else if(sessizHarfler.contains(harf)){
                    System.out.println("sessiz harf");
                    break;
                }else {
                    System.out.println("yanlis karakter girdiniz");
                    break;
                }
            }
        }else System.out.println("tek karakter giriniz");


        }
}

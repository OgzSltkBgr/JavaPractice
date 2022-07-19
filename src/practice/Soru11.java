package practice;

import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {
       /*
       Kullanıcıdan alınan Stringin son karakteirini silep ekrana yazan Java kodunu yazınız.
    Test Data:
    good
    Beklenen Çıktı:
    goo
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String input = scan.nextLine();

        String newInput = input.substring(0,input.length()-1);

        System.out.println(newInput);
    }
}

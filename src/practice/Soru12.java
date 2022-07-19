package practice;

import java.util.Scanner;

public class Soru12 {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

    Test Data:
    Java is fun

    Beklenen Sonuç:
    JAVA IS FUN
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String input = scan.nextLine();

        String newInput = input.toUpperCase();

        System.out.println(newInput);
    }
}

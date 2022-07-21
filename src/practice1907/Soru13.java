package practice1907;

import java.util.Scanner;

public class Soru13 {
    public static void main(String[] args) {
        /*
        Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru okuyan bir
        kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

    Test Data:
    madam

    Beklenen Çıktı:
    True
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String input = scan.nextLine();
        String tersInput ="";

        for (int i =input.length()-1; i>=0 ; i--) {
            tersInput += input.charAt(i);
        }

        if (input.equals(tersInput)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome degil");
        }

    }
}

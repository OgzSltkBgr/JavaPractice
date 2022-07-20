package practice2007;

import java.util.Scanner;

public class Interwiev {

    public static void main(String[] args) {
        // kullanicidan alinan bir stringin ilk ve son harfini yine kullanicidan alinan
        // sayi kadar return eden method yaziniz
        // ornek elma 2    eaea

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");
        String input = scan.nextLine();
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println("harfMethod(input, sayi) = " + harfMethod(input, sayi));


    }

    private static String harfMethod(String input, int sayi) {

        String s=input.substring(0,1)+input.substring(input.length()-1);
        String output = "";

        for (int i =1; i <sayi ; i++) {
            output+=s;
        }

        return output;
    }
}

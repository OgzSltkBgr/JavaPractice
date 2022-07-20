package practice2007;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*
        kullanicidan x girilene kadar ekrana program çalışıyor yazan
        ve x girildiginde ise program bitti yazan programı yaziniz
         */

        Scanner scan = new Scanner(System.in);
        String str ="";

        do {
            System.out.println("Karakter giriniz");
             str = scan.nextLine();
             if (!str.equalsIgnoreCase("x")){
                 System.out.println("Program calisiyor");
             }

        }while(!str.equalsIgnoreCase("x"));
        System.out.println("Program bitti");

    }
}

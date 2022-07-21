package practice2107;

import java.util.Scanner;

public class Replit1 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
        char ch1= 'a' ;
	    String name =“John came late"
	    Expected Output:
        Number of a = 2
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");
        String name = scan.nextLine();

        System.out.println("lutfen bir karakter giriniz");
        char ch1 = scan.next().charAt(0);

        int count=0;

    //    for (int i = 0; i <name.length(); i++) {
    //        if (name.contains()){
    //            count++;
    //        }
    //    }
    //    System.out.println(count);
     //   while (){
     //       if (name.contains(ch1+"")){
     //           count++;
     //       }
     //   }
     //   System.out.println(count);
    }
}

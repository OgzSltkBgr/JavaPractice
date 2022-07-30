package practice0722;

import java.util.Scanner;

public class Soru33 {
    /*
    Bir arrayi tersine çeviren  method yazınız.
​
    Test Data:
​
    reverse [1, 2, 3, 4]
    return  [4, 3, 2, 1]
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac elemanli bir array olusturmami istersiniz");
        int uzunluk=scan.nextInt();
        int[] olusturulan =new int[uzunluk];
        int []tersOlusturulan= new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println(i + ". index icin sayi giriniz");
            olusturulan[i] = scan.nextInt();
        }
    }
}

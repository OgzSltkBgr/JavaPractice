package practice1907;

public class Soru1 {

    public static void main(String[] args) {
        // Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.

        int num = 78;
        int toplam =0;


        for (int i = 0; i <num ; i++) {
           toplam +=num%10;
           num/=10;
        }
        System.out.println(toplam);





    }
}

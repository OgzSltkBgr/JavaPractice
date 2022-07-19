package practice;

public class Soru1 {

    public static void main(String[] args) {
        // Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.

        int num = 78;
        int toplam =0;
        int deger=0;

        for (int i = 0; i <num ; i++) {
            deger =num%10;
            toplam+=deger;
            num/=10;
        }
        System.out.println(toplam);





    }
}

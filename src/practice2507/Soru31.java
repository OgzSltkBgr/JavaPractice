package practice2507;

public class Soru31 {
    public static void main(String[] args) {
        /*
         Saati saniyeye çeviren java methodunu yazınız.
​
    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
         */
        int saat=2;

        saatCevir(saat);
    }

    private static void saatCevir(int saat) {

        int saniye = saat*60*60;
        System.out.println(saniye);
    }
}

package practice0721;

import java.util.Arrays;

public class Soru24IkinciCozum {
    public static void main(String[] args) {
        Integer [] sayilar={1551,1223,1443,1267,1789,1023,2020};
        Integer arananDeger=1551;
        boolean sonuc = false;

        Arrays.sort(sayilar);


        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i].equals(arananDeger)){
                sonuc=true;
            }
        }
        System.out.println(sonuc);

    }
}

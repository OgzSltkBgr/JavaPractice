package practice2107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Soru24 {
    public static void main(String[] args) {
        /*
        yazılan değerin array içerisinde arayan Java Kodu yazınız.
​
    Array: [1551,1223,1443,1267,1789,1023,2020]
​
​
    Aranan Değer:2020
    Beklenen Çıktı:True
​
    Aranan Değer:2010
    Beklenen Çıktı :False
         */
        Integer [] sayilar={1551,1223,1443,1267,1789,1023,2020};
        Integer arananDeger=2020;

        Arrays.sort(sayilar);
       boolean sonuc = contains(sayilar, arananDeger);;

       if (sonuc){
           System.out.println("Girilen deger listede var");
        }else {
           System.out.println("girilen deger listede yok");
       }

    //   int [] sayilar={1551,1223,1443,1267,1789,1023,2020};
    //   int input=2020;
    //   List<Integer> answer=new ArrayList<Integer>();
    //   for (int i = 0; i < sayilar.length ; i++) {
    //       answer.add(sayilar[i]);
    //   }

    //   if (answer.contains(input)) {
    //       System.out.println(input);
    //   }
    }

    public static boolean contains(Integer[] sayilar, int arananDeger) {
        boolean sonucMethod=false;

        for (int i = 0; i < sayilar.length ; i++) {
            if (sayilar[i].equals(arananDeger)){
                sonucMethod=true;
            }
        }
        return sonucMethod;
    }
}
